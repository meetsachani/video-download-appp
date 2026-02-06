package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.Dj0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2748Dj0 extends M0 implements Serializable {
    public static final Comparator<File> Y;
    public static final Comparator<File> Y0;
    public static final Comparator<File> Z;
    public static final Comparator<File> Z0;
    public static final Comparator<File> a1;
    public static final Comparator<File> b1;
    private static final long serialVersionUID = 1928235200184222815L;
    public final EnumC10679xJ0 X;

    static {
        C2748Dj0 c2748Dj0 = new C2748Dj0();
        Y = c2748Dj0;
        Z = new BU1(c2748Dj0);
        C2748Dj0 c2748Dj02 = new C2748Dj0(EnumC10679xJ0.INSENSITIVE);
        Y0 = c2748Dj02;
        Z0 = new BU1(c2748Dj02);
        C2748Dj0 c2748Dj03 = new C2748Dj0(EnumC10679xJ0.SYSTEM);
        a1 = c2748Dj03;
        b1 = new BU1(c2748Dj03);
    }

    public C2748Dj0() {
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
        return this.X.i(C4837Yq0.n(file.getName()), C4837Yq0.n(file2.getName()));
    }

    @Override // o.M0
    public String toString() {
        return super.toString() + "[ioCase=" + this.X + C6566gU0.g;
    }

    public C2748Dj0(EnumC10679xJ0 enumC10679xJ0) {
        this.X = EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SENSITIVE);
    }
}
