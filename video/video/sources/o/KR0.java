package o;

/* loaded from: classes.dex */
public final class KR0 implements InterfaceC4784Yd<int[]> {
    public static final String a = "IntegerArrayPool";

    @Override // o.InterfaceC4784Yd
    public int a() {
        return 4;
    }

    @Override // o.InterfaceC4784Yd
    /* renamed from: c */
    public int b(int[] iArr) {
        return iArr.length;
    }

    @Override // o.InterfaceC4784Yd
    /* renamed from: d */
    public int[] newArray(int i) {
        return new int[i];
    }

    @Override // o.InterfaceC4784Yd
    public String i0() {
        return a;
    }
}
