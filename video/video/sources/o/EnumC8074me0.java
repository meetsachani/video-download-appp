package o;

/* renamed from: o.me0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC8074me0 {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final EnumC8074me0[] a1;
    public final int X;

    static {
        EnumC8074me0 enumC8074me0 = L;
        EnumC8074me0 enumC8074me02 = M;
        EnumC8074me0 enumC8074me03 = Q;
        a1 = new EnumC8074me0[]{enumC8074me02, enumC8074me0, H, enumC8074me03};
    }

    EnumC8074me0(int i) {
        this.X = i;
    }

    public static EnumC8074me0 e(int i) {
        if (i >= 0) {
            EnumC8074me0[] enumC8074me0Arr = a1;
            if (i < enumC8074me0Arr.length) {
                return enumC8074me0Arr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    public int g() {
        return this.X;
    }
}
