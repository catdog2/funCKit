/*
 * funCKit - functional Circuit Kit
 * Copyright (C) 2013  Lukas Elsner <open@mindrunner.de>
 * Copyright (C) 2013  Peter Dahlberg <catdog2@tuxzone.org>
 * Copyright (C) 2013  Julian Stier <mail@julian-stier.de>
 * Copyright (C) 2013  Sebastian Vetter <mail@b4sti.eu>
 * Copyright (C) 2013  Thomas Poxrucker <poxrucker_t@web.de>
 * Copyright (C) 2013  Alexander Treml <alex.treml@directbox.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.sep2011.funckit.view.filechooser;

import java.io.File;
import java.io.FilenameFilter;

/**
 * FilenameFilter that combines all saveable file formats. (funCKit, SEP, gif, jpg, pdf, png, svg)
 */
class SaveFilenameFilter implements FilenameFilter {

    private final AbstractFileFilter funckitFormat = new FunckitFileFilter();
    private final AbstractFileFilter sepFormat = new SepFileFilter();
    private final AbstractFileFilter gifFormat = new GifFileFilter();
    private final AbstractFileFilter jpgFormat = new JpgFileFilter();
    private final AbstractFileFilter pdfFormat = new PdfFileFilter();
    private final AbstractFileFilter pngFormat = new PngFileFilter();
    private final AbstractFileFilter svgFormat = new SvgFileFilter();

    @Override
    public boolean accept(File dir, String name) {
        return funckitFormat.accept(dir, name) || sepFormat.accept(dir, name)
                || gifFormat.accept(dir, name) || jpgFormat.accept(dir, name)
                || pdfFormat.accept(dir, name) || pngFormat.accept(dir, name)
                || svgFormat.accept(dir, name);
    }

}
