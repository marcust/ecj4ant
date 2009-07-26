/*
 * $ Id $
 * (c) Copyright 2009 Marcus Thiesen (marcus@thiesen.org)
 *
 *  This file is part of ecj4ant.
 *
 *  ecj4ant is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  ecj4ant is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with ecj4ant.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.thiesen.ecj4ant;

import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jdt.internal.compiler.CompilationResult;
import org.eclipse.jdt.internal.compiler.ICompilerRequestor;

public class BatchRequestor implements ICompilerRequestor {

    private int _warnings;
    private int _errors;
    private int _infos;
    
    private final ProblemOutput _out;

    BatchRequestor( final ProblemOutput out ) {
        super();
        _out = out;
    }

    @Override
    public void acceptResult( final CompilationResult result ) {
        final CategorizedProblem[] allProblems = result.getAllProblems();

        if ( allProblems == null ) {
            return;
        }
        
        for ( final CategorizedProblem problem : allProblems ) {
            countProblem( problem );
            outputProblem( problem );
        }
        
    }

    private void countProblem( final CategorizedProblem problem ) {
        if ( problem.isWarning() ) {
            _warnings++;
        } else 
        if ( problem.isError() ) {
            _errors++;
        } else {
            _infos++;
        }
    }

    private void outputProblem( final CategorizedProblem problem ) {
        if ( problem.isWarning() ) {
            _out.warning( problem );
        } else 
        if ( problem.isError() ) {
            _out.error( problem );
        } else {
            _out.info( problem );
        }
    }

    public int getWarnings() {
        return _warnings;
    }

    public int getErrors() {
        return _errors;
        
    }
    
    public int getInfos() {
        return _infos;
        
    }

}
