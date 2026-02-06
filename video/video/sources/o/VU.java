package o;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* loaded from: classes.dex */
public final class VU<Model, Data> implements InterfaceC7595kk1<Model, Data> {
    public static final String b = "data:image";
    public static final String c = ";base64";
    public final a<Data> a;

    /* loaded from: classes.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    public VU(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // o.InterfaceC7595kk1
    public boolean a(Model model) {
        return model.toString().startsWith(b);
    }

    @Override // o.InterfaceC7595kk1
    public InterfaceC7595kk1.a<Data> b(Model model, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(model), new b(model.toString(), this.a));
    }

    /* loaded from: classes.dex */
    public static final class b<Data> implements InterfaceC9990uU<Data> {
        public final String X;
        public final a<Data> Y;
        public Data Z;

        public b(String str, a<Data> aVar) {
            this.X = str;
            this.Y = aVar;
        }

        @Override // o.InterfaceC9990uU
        public Class<Data> a() {
            return this.Y.a();
        }

        @Override // o.InterfaceC9990uU
        public void b() {
            try {
                this.Y.b(this.Z);
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super Data> aVar) {
            try {
                Data c = this.Y.c(this.X);
                this.Z = c;
                aVar.f(c);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }

        @Override // o.InterfaceC9990uU
        public GU e() {
            return GU.LOCAL;
        }

        @Override // o.InterfaceC9990uU
        public void cancel() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements InterfaceC7838lk1<Model, InputStream> {
        public final a<InputStream> a = new a();

        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public a() {
            }

            @Override // o.VU.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // o.VU.a
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // o.VU.a
            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith(VU.b)) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(VU.c)) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Model, InputStream> e(C5650cm1 c5650cm1) {
            return new VU(this.a);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
