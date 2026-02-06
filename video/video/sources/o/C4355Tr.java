package o;

import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* renamed from: o.Tr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4355Tr implements com.bumptech.glide.load.data.a<ByteBuffer> {
    public final ByteBuffer a;

    /* renamed from: o.Tr$a */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0063a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0063a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0063a
        /* renamed from: c */
        public com.bumptech.glide.load.data.a<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new C4355Tr(byteBuffer);
        }
    }

    public C4355Tr(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    /* renamed from: a */
    public ByteBuffer c() {
        this.a.position(0);
        return this.a;
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
    }
}
