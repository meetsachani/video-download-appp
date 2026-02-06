package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.ez1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6187ez1 extends M0 implements Serializable {
    public static final Comparator<File> Y;
    public static final Comparator<File> Y0;
    public static final Comparator<File> Z;
    public static final Comparator<File> Z0;
    public static final Comparator<File> a1;
    public static final Comparator<File> b1;
    private static final long serialVersionUID = 6527501707585768673L;
    public final EnumC10679xJ0 X;

    static {
        C6187ez1 c6187ez1 = new C6187ez1();
        Y = c6187ez1;
        Z = new BU1(c6187ez1);
        C6187ez1 c6187ez12 = new C6187ez1(EnumC10679xJ0.INSENSITIVE);
        Y0 = c6187ez12;
        Z0 = new BU1(c6187ez12);
        C6187ez1 c6187ez13 = new C6187ez1(EnumC10679xJ0.SYSTEM);
        a1 = c6187ez13;
        b1 = new BU1(c6187ez13);
    }

    public C6187ez1() {
        this.X = EnumC10679xJ0.SENSITIVE;
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
        return this.X.i(file.getPath(), file2.getPath());
    }

    @Override // o.M0
    public String toString() {
        return super.toString() + "[ioCase=" + this.X + C6566gU0.g;
    }

    public C6187ez1(EnumC10679xJ0 enumC10679xJ0) {
        this.X = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
    }
}
