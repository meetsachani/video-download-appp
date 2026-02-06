package o;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes4.dex */
public class T10 extends N0 implements Serializable {
    private static final long serialVersionUID = -8723373124984771318L;
    public final transient FilenameFilter Y0;
    public final transient FileFilter Z;

    public T10(FileFilter fileFilter) {
        Objects.requireNonNull(fileFilter, "filter");
        this.Z = fileFilter;
        this.Y0 = null;
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        FileFilter fileFilter = this.Z;
        if (fileFilter != null) {
            return fileFilter.accept(file);
        }
        return super.accept(file);
    }

    @Override // o.N0
    public String toString() {
        String objects = Objects.toString(this.Z, Objects.toString(this.Y0, null));
        return super.toString() + C9811tl1.c + objects + C9811tl1.d;
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FilenameFilter filenameFilter = this.Y0;
        if (filenameFilter != null) {
            return filenameFilter.accept(file, str);
        }
        return super.accept(file, str);
    }

    public T10(FilenameFilter filenameFilter) {
        Objects.requireNonNull(filenameFilter, "filter");
        this.Y0 = filenameFilter;
        this.Z = null;
    }
}
