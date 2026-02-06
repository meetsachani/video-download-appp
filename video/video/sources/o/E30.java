package o;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* loaded from: classes.dex */
public final class E30<DataT> implements InterfaceC7595kk1<Integer, DataT> {
    public final Context a;
    public final e<DataT> b;

    /* loaded from: classes.dex */
    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        DataT c(Resources.Theme theme, Resources resources, int i);
    }

    public E30(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    public static InterfaceC7838lk1<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static InterfaceC7838lk1<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static InterfaceC7838lk1<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public InterfaceC7595kk1.a<DataT> b(Integer num, int i, int i2, C5448bw1 c5448bw1) {
        Resources resources;
        Resources.Theme theme = (Resources.Theme) c5448bw1.c(C7776lT1.b);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.a.getResources();
        }
        return new InterfaceC7595kk1.a<>(new C7874lt1(num), new d(theme, resources, this.b, num.intValue()));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: f */
    public boolean a(Integer num) {
        return true;
    }

    /* loaded from: classes.dex */
    public static final class a implements InterfaceC7838lk1<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // o.E30.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Integer, AssetFileDescriptor> e(C5650cm1 c5650cm1) {
            return new E30(this.a, this);
        }

        @Override // o.E30.e
        /* renamed from: f */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // o.E30.e
        /* renamed from: g */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC7838lk1<Integer, Drawable>, e<Drawable> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // o.E30.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Integer, Drawable> e(C5650cm1 c5650cm1) {
            return new E30(this.a, this);
        }

        @Override // o.E30.e
        /* renamed from: g */
        public Drawable c(Resources.Theme theme, Resources resources, int i) {
            return H60.a(this.a, i, theme);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }

        @Override // o.E30.e
        /* renamed from: f */
        public void b(Drawable drawable) throws IOException {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements InterfaceC7838lk1<Integer, InputStream>, e<InputStream> {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // o.E30.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Integer, InputStream> e(C5650cm1 c5650cm1) {
            return new E30(this.a, this);
        }

        @Override // o.E30.e
        /* renamed from: f */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // o.E30.e
        /* renamed from: g */
        public InputStream c(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* loaded from: classes.dex */
    public static final class d<DataT> implements InterfaceC9990uU<DataT> {
        public final Resources.Theme X;
        public final Resources Y;
        public final int Y0;
        public final e<DataT> Z;
        public DataT Z0;

        public d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.X = theme;
            this.Y = resources;
            this.Z = eVar;
            this.Y0 = i;
        }

        @Override // o.InterfaceC9990uU
        public Class<DataT> a() {
            return this.Z.a();
        }

        @Override // o.InterfaceC9990uU
        public void b() {
            DataT datat = this.Z0;
            if (datat != null) {
                try {
                    this.Z.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super DataT> aVar) {
            try {
                DataT c = this.Z.c(this.X, this.Y, this.Y0);
                this.Z0 = c;
                aVar.f(c);
            } catch (Resources.NotFoundException e) {
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
