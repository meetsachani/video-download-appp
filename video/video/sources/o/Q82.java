package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class Q82 extends M0 implements Serializable {
    public static final Comparator<File> Y;
    public static final Comparator<File> Y0;
    public static final Comparator<File> Z;
    public static final Comparator<File> Z0;
    private static final long serialVersionUID = -1201561106411416190L;
    public final boolean X;

    static {
        Q82 q82 = new Q82();
        Y = q82;
        Z = new BU1(q82);
        Q82 q822 = new Q82(true);
        Y0 = q822;
        Z0 = new BU1(q822);
    }

    public Q82() {
        this.X = false;
    }

    @Override // o.M0
    public /* bridge */ /* synthetic */ List a(List list) {
        return super.a(list);
    }

    @Override // o.M0
    public /* bridge */ /* synthetic */ File[] b(File[] fileArr) {
        return super.b(fileArr);
    }

    @Override // java.util.Comparator
    /* renamed from: c */
    public int compare(File file, File file2) {
        long length;
        long length2;
        if (file.isDirectory()) {
            if (this.X && file.exists()) {
                length = C3961Pq0.M1(file);
            } else {
                length = 0;
            }
        } else {
            length = file.length();
        }
        if (file2.isDirectory()) {
            if (this.X && file2.exists()) {
                length2 = C3961Pq0.M1(file2);
            } else {
                length2 = 0;
            }
        } else {
            length2 = file2.length();
        }
        int i = ((length - length2) > 0L ? 1 : ((length - length2) == 0L ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    @Override // o.M0
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.X + C6566gU0.g;
    }

    public Q82(boolean z) {
        this.X = z;
    }
}
