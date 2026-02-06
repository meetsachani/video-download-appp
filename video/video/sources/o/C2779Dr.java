package o;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.Dr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2779Dr<Data> implements InterfaceC7595kk1<byte[], Data> {
    public final b<Data> a;

    /* renamed from: o.Dr$b */
    /* loaded from: classes.dex */
    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public C2779Dr(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<Data> b(byte[] bArr, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(bArr), new c(bArr, this.a));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(byte[] bArr) {
        return true;
    }

    /* renamed from: o.Dr$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC7838lk1<byte[], ByteBuffer> {

        /* renamed from: o.Dr$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0176a implements b<ByteBuffer> {
            public C0176a() {
            }

            @Override // o.C2779Dr.b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // o.C2779Dr.b
            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<byte[], ByteBuffer> e(C5650cm1 c5650cm1) {
            return new C2779Dr(new C0176a());
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.Dr$c */
    /* loaded from: classes.dex */
    public static class c<Data> implements InterfaceC9990uU<Data> {
        public final byte[] X;
        public final b<Data> Y;

        public c(byte[] bArr, b<Data> bVar) {
            this.X = bArr;
            this.Y = bVar;
        }

        @Override // o.InterfaceC9990uU
        public Class<Data> a() {
            return this.Y.a();
        }

        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super Data> aVar) {
            aVar.f((Data) this.Y.b(this.X));
        }

        @Override // o.InterfaceC9990uU
        public GU e() {
            return GU.LOCAL;
        }

        @Override // o.InterfaceC9990uU
        public void b() {
        }

        @Override // o.InterfaceC9990uU
        public void cancel() {
        }
    }

    /* renamed from: o.Dr$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC7838lk1<byte[], InputStream> {

        /* renamed from: o.Dr$d$a */
        /* loaded from: classes.dex */
        public class a implements b<InputStream> {
            public a() {
            }

            @Override // o.C2779Dr.b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // o.C2779Dr.b
            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<byte[], InputStream> e(C5650cm1 c5650cm1) {
            return new C2779Dr(new a());
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
