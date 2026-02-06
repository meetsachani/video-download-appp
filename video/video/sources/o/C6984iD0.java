package o;

import android.graphics.Bitmap;
import o.InterfaceC7225jD0;

/* renamed from: o.iD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6984iD0 implements InterfaceC7225jD0.a {
    public final InterfaceC4931Zn a;
    public final InterfaceC2727De b;

    public C6984iD0(InterfaceC4931Zn interfaceC4931Zn) {
        this(interfaceC4931Zn, null);
    }

    @Override // o.InterfaceC7225jD0.a
    public void a(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    @Override // o.InterfaceC7225jD0.a
    public byte[] b(int i) {
        InterfaceC2727De interfaceC2727De = this.b;
        if (interfaceC2727De == null) {
            return new byte[i];
        }
        return (byte[]) interfaceC2727De.c(i, byte[].class);
    }

    @Override // o.InterfaceC7225jD0.a
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return this.a.g(i, i2, config);
    }

    @Override // o.InterfaceC7225jD0.a
    public int[] d(int i) {
        InterfaceC2727De interfaceC2727De = this.b;
        if (interfaceC2727De == null) {
            return new int[i];
        }
        return (int[]) interfaceC2727De.c(i, int[].class);
    }

    @Override // o.InterfaceC7225jD0.a
    public void e(byte[] bArr) {
        InterfaceC2727De interfaceC2727De = this.b;
        if (interfaceC2727De == null) {
            return;
        }
        interfaceC2727De.put(bArr);
    }

    @Override // o.InterfaceC7225jD0.a
    public void f(int[] iArr) {
        InterfaceC2727De interfaceC2727De = this.b;
        if (interfaceC2727De == null) {
            return;
        }
        interfaceC2727De.put(iArr);
    }

    public C6984iD0(InterfaceC4931Zn interfaceC4931Zn, InterfaceC2727De interfaceC2727De) {
        this.a = interfaceC4931Zn;
        this.b = interfaceC2727De;
    }
}
