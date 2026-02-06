package o;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.qp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9091qp0<Data> implements InterfaceC7595kk1<File, Data> {
    public static final String b = "FileLoader";
    public final d<Data> a;

    /* renamed from: o.qp0$b */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* renamed from: o.qp0$b$a */
        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // o.C9091qp0.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // o.C9091qp0.d
            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // o.C9091qp0.d
            /* renamed from: e */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* renamed from: o.qp0$d */
    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* renamed from: o.qp0$e */
    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* renamed from: o.qp0$e$a */
        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // o.C9091qp0.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // o.C9091qp0.d
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // o.C9091qp0.d
            /* renamed from: e */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C9091qp0(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<Data> b(File file, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(file), new c(file, this.a));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }

    /* renamed from: o.qp0$a */
    /* loaded from: classes.dex */
    public static class a<Data> implements InterfaceC7838lk1<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // o.InterfaceC7838lk1
        public final InterfaceC7595kk1<File, Data> e(C5650cm1 c5650cm1) {
            return new C9091qp0(this.a);
        }

        @Override // o.InterfaceC7838lk1
        public final void d() {
        }
    }

    /* renamed from: o.qp0$c */
    /* loaded from: classes.dex */
    public static final class c<Data> implements InterfaceC9990uU<Data> {
        public final File X;
        public final d<Data> Y;
        public Data Z;

        public c(File file, d<Data> dVar) {
            this.X = file;
            this.Y = dVar;
        }

        @Override // o.InterfaceC9990uU
        public Class<Data> a() {
            return this.Y.a();
        }

        @Override // o.InterfaceC9990uU
        public void b() {
            Data data = this.Z;
            if (data != null) {
                try {
                    this.Y.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super Data> aVar) {
            try {
                Data c = this.Y.c(this.X);
                this.Z = c;
                aVar.f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable(C9091qp0.b, 3)) {
                    Log.d(C9091qp0.b, "Failed to open file", e);
                }
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
}
