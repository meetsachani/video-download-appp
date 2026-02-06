package o;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.Kr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3476Kr implements InterfaceC7290jT1<ByteBuffer, Bitmap> {
    public final C10138v60 a;

    public C3476Kr(C10138v60 c10138v60) {
        this.a = c10138v60;
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        return this.a.g(byteBuffer, i, i2, c5448bw1);
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, C5448bw1 c5448bw1) {
        return this.a.t(byteBuffer);
    }
}
