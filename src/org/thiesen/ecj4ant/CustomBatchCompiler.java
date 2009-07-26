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

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.eclipse.jdt.internal.compiler.batch.Main;
import org.eclipse.jdt.internal.compiler.batch.FileSystem.Classpath;

public class CustomBatchCompiler extends Main {

    CustomBatchCompiler( final PrintWriter outWriter, final PrintWriter errWriter, final boolean systemExitWhenFinished, final Map<?,?> customDefaultOptions,
            final CompilationProgress compilationProgress ) {
        super( outWriter, errWriter, systemExitWhenFinished, customDefaultOptions, compilationProgress );
    }

    public Classpath[] getCheckedClasspaths() {
        return checkedClasspaths;
    }

    @Override
    public void printUsage() {
        // do nothing here
    }

    public void initPaths() {
        final ArrayList<?> bootclasspaths = new ArrayList<Object>(DEFAULT_SIZE_CLASSPATH);
        final String sourcepathClasspathArg = null;
        final ArrayList<?> sourcepathClasspaths = new ArrayList<Object>(DEFAULT_SIZE_CLASSPATH);
        final ArrayList<?> classpaths = new ArrayList<Object>(DEFAULT_SIZE_CLASSPATH);
        final ArrayList<?> extdirsClasspaths = null;
        final ArrayList<?> endorsedDirClasspaths = null;

        
        setPaths(bootclasspaths,
                sourcepathClasspathArg,
                sourcepathClasspaths,
                classpaths,
                extdirsClasspaths,
                endorsedDirClasspaths,
                null);
        
    }
    
    
   
}
