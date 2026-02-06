package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.C5693cx0;
import o.C5935dx0;

/* renamed from: o.ww2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10588ww2 {
    public static final String b = "TypefaceCompatBaseImpl";
    public static final int c = 0;
    public ConcurrentHashMap<Long, C5693cx0.d> a = new ConcurrentHashMap<>();

    /* renamed from: o.ww2$a */
    /* loaded from: classes.dex */
    public class a implements d<C5935dx0.c> {
        public a() {
        }

        @Override // o.C10588ww2.d
        /* renamed from: c */
        public int b(C5935dx0.c cVar) {
            return cVar.e();
        }

        @Override // o.C10588ww2.d
        /* renamed from: d */
        public boolean a(C5935dx0.c cVar) {
            return cVar.f();
        }
    }

    /* renamed from: o.ww2$b */
    /* loaded from: classes.dex */
    public class b implements d<C5693cx0.e> {
        public b() {
        }

        @Override // o.C10588ww2.d
        /* renamed from: c */
        public int b(C5693cx0.e eVar) {
            return eVar.e();
        }

        @Override // o.C10588ww2.d
        /* renamed from: d */
        public boolean a(C5693cx0.e eVar) {
            return eVar.f();
        }
    }

    /* renamed from: o.ww2$c */
    /* loaded from: classes.dex */
    public class c implements d<C5693cx0.e> {
        public c() {
        }

        @Override // o.C10588ww2.d
        /* renamed from: c */
        public int b(C5693cx0.e eVar) {
            return eVar.e();
        }

        @Override // o.C10588ww2.d
        /* renamed from: d */
        public boolean a(C5693cx0.e eVar) {
            return eVar.f();
        }
    }

    /* renamed from: o.ww2$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(T t);

        int b(T t);
    }

    public static <T> T k(T[] tArr, int i, d<T> dVar) {
        int i2;
        boolean z;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return (T) l(tArr, i2, z, dVar);
    }

    public static <T> T l(T[] tArr, int i, boolean z, d<T> dVar) {
        int i2;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(dVar.b(t2) - i) * 2;
            if (dVar.a(t2) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i4 = abs + i2;
            if (t == null || i3 > i4) {
                t = t2;
                i3 = i4;
            }
        }
        return t;
    }

    public static long o(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e(b, "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e(b, "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    public final void a(Typeface typeface, C5693cx0.d dVar) {
        long o2 = o(typeface);
        if (o2 != 0) {
            this.a.put(Long.valueOf(o2), dVar);
        }
    }

    public Typeface b(Context context, C5693cx0.d dVar, Resources resources, int i) {
        C5693cx0.e i2 = i(dVar, i);
        if (i2 == null) {
            return null;
        }
        Typeface i3 = C9128qw2.i(context, resources, i2.b(), i2.a(), 0, i);
        a(i3, dVar);
        return i3;
    }

    public Typeface c(Context context, C5693cx0.d dVar, Resources resources, int i, boolean z) {
        C5693cx0.e j = j(dVar, i, z);
        if (j == null) {
            return null;
        }
        Typeface i2 = C9128qw2.i(context, resources, j.b(), j.a(), 0, 0);
        a(i2, dVar);
        return i2;
    }

    public Typeface d(Context context, CancellationSignal cancellationSignal, C5935dx0.c[] cVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m(cVarArr, i).d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface f = f(context, inputStream);
            C10831xw2.a(inputStream);
            return f;
        } catch (IOException unused2) {
            C10831xw2.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            C10831xw2.a(inputStream2);
            throw th;
        }
    }

    public Typeface e(Context context, CancellationSignal cancellationSignal, List<C5935dx0.c[]> list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface f(Context context, InputStream inputStream) {
        File e = C10831xw2.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C10831xw2.d(e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface g(Context context, Resources resources, int i, String str, int i2) {
        File e = C10831xw2.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C10831xw2.c(e, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface h(Context context, Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = GK2.a(this, context, typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 != null) {
            return typeface2;
        }
        return typeface;
    }

    public final C5693cx0.e i(C5693cx0.d dVar, int i) {
        return (C5693cx0.e) k(dVar.a(), i, new b());
    }

    public final C5693cx0.e j(C5693cx0.d dVar, int i, boolean z) {
        return (C5693cx0.e) l(dVar.a(), i, z, new c());
    }

    public C5935dx0.c m(C5935dx0.c[] cVarArr, int i) {
        return (C5935dx0.c) k(cVarArr, i, new a());
    }

    public C5693cx0.d n(Typeface typeface) {
        long o2 = o(typeface);
        if (o2 == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(o2));
    }
}
