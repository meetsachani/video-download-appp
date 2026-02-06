package o;

/* renamed from: o.xr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10808xr implements InterfaceC4784Yd<byte[]> {
    public static final String a = "ByteArrayPool";

    @Override // o.InterfaceC4784Yd
    public int a() {
        return 1;
    }

    @Override // o.InterfaceC4784Yd
    /* renamed from: c */
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // o.InterfaceC4784Yd
    /* renamed from: d */
    public byte[] newArray(int i) {
        return new byte[i];
    }

    @Override // o.InterfaceC4784Yd
    public String i0() {
        return a;
    }
}
