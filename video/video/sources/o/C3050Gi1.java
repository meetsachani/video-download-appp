package o;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import o.C3388Jt1;

@Deprecated
/* renamed from: o.Gi1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3050Gi1 extends C3388Jt1 {
    public static final String Z0 = "MD5";
    public final MessageDigest Y0;

    /* renamed from: o.Gi1$b */
    /* loaded from: classes4.dex */
    public static class b extends C3388Jt1.a<b> {
        public MessageDigest n;

        public b() {
            try {
                this.n = C3050Gi1.C();
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // o.XK0
        /* renamed from: o0 */
        public C3050Gi1 get() throws IOException {
            m0(Arrays.asList(new c(this.n)));
            return new C3050Gi1(this);
        }

        public void p0(String str) throws NoSuchAlgorithmException {
            this.n = MessageDigest.getInstance(str);
        }

        public void q0(MessageDigest messageDigest) {
            this.n = messageDigest;
        }
    }

    /* renamed from: o.Gi1$c */
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

    public static MessageDigest C() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("MD5");
    }

    public MessageDigest E() {
        return this.Y0;
    }

    public C3050Gi1(b bVar) throws IOException {
        super(bVar);
        this.Y0 = bVar.n;
    }

    @Deprecated
    public C3050Gi1(InputStream inputStream) throws NoSuchAlgorithmException {
        this(inputStream, C());
    }

    @Deprecated
    public C3050Gi1(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, new c(messageDigest));
        this.Y0 = messageDigest;
    }

    @Deprecated
    public C3050Gi1(InputStream inputStream, String str) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance(str));
    }
}
