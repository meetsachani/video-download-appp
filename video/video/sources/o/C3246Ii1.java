package o;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import o.C3388Jt1;

/* renamed from: o.Ii1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3246Ii1 extends C3388Jt1 {
    public final MessageDigest Y0;

    /* renamed from: o.Ii1$b */
    /* loaded from: classes4.dex */
    public static class b extends C3388Jt1.a<b> {
        public MessageDigest n;

        @Override // o.XK0
        /* renamed from: o0 */
        public C3246Ii1 get() throws IOException {
            m0(Arrays.asList(new c(this.n)));
            return new C3246Ii1(this);
        }

        public b p0(String str) throws NoSuchAlgorithmException {
            this.n = MessageDigest.getInstance(str);
            return this;
        }

        public b q0(MessageDigest messageDigest) {
            this.n = messageDigest;
            return this;
        }
    }

    /* renamed from: o.Ii1$c */
    /* loaded from: classes4.dex */
    public static class c extends C3388Jt1.c {
        public final MessageDigest a;

        public c(MessageDigest messageDigest) {
            Objects.requireNonNull(messageDigest, "messageDigest");
            this.a = messageDigest;
        }

        @Override // o.C3388Jt1.c
        public void b(int i) throws IOException {
            this.a.update((byte) i);
        }

        @Override // o.C3388Jt1.c
        public void c(byte[] bArr, int i, int i2) throws IOException {
            this.a.update(bArr, i, i2);
        }
    }

    public static b A() {
        return new b();
    }

    public MessageDigest C() {
        return this.Y0;
    }

    public C3246Ii1(b bVar) throws IOException {
        super(bVar);
        MessageDigest messageDigest = bVar.n;
        Objects.requireNonNull(messageDigest, "builder.messageDigest");
        this.Y0 = messageDigest;
    }
}
