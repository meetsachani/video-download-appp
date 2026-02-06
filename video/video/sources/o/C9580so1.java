package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.so1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9580so1 extends M0 implements Serializable {
    public static final Comparator<File> Y;
    public static final Comparator<File> Y0;
    public static final Comparator<File> Z;
    public static final Comparator<File> Z0;
    public static final Comparator<File> a1;
    public static final Comparator<File> b1;
    private static final long serialVersionUID = 8397947749814525798L;
    public final EnumC10679xJ0 X;

    static {
        C9580so1 c9580so1 = new C9580so1();
        Y = c9580so1;
        Z = new BU1(c9580so1);
        C9580so1 c9580so12 = new C9580so1(EnumC10679xJ0.INSENSITIVE);
        Y0 = c9580so12;
        Z0 = new BU1(c9580so12);
        C9580so1 c9580so13 = new C9580so1(EnumC10679xJ0.SYSTEM);
        a1 = c9580so13;
        b1 = new BU1(c9580so13);
    }

    public C9580so1() {
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
        return this.X.i(file.getName(), file2.getName());
    }

    @Override // o.M0
    public String toString() {
        return super.toString() + "[ioCase=" + this.X + C6566gU0.g;
    }

    public C9580so1(EnumC10679xJ0 enumC10679xJ0) {
        this.X = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
    }
}
