package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class R30 extends M0 implements Serializable {
    public static final int X = 2;
    public static final int Y = 1;
    public static final Comparator<File> Y0;
    public static final Comparator<File> Z;
    private static final long serialVersionUID = 296132640160964395L;

    static {
        R30 r30 = new R30();
        Z = r30;
        Y0 = new BU1(r30);
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
        return d(file) - d(file2);
    }

    public final int d(File file) {
        if (file.isDirectory()) {
            return 1;
        }
        return 2;
    }

    @Override // o.M0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
