package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.aZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5112aZ extends M0 implements Serializable {
    public static final Comparator<File> X;
    public static final Comparator<File> Y;
    private static final long serialVersionUID = 3260141861365313518L;

    static {
        C5112aZ c5112aZ = new C5112aZ();
        X = c5112aZ;
        Y = new BU1(c5112aZ);
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
        return file.compareTo(file2);
    }

    @Override // o.M0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
