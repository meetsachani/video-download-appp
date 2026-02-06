package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.MetaDataStore;
import java.util.Arrays;
import java.util.Locale;
import o.C6562gT0;
import o.C8319ne2;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class M {
    @NotNull
    public static final c f = new c(null);
    public static final int g = 0;
    @NotNull
    public static final String h = "%s/%s/picture";
    @NotNull
    public static final String i = "height";
    @NotNull
    public static final String j = "width";
    @NotNull
    public static final String k = "access_token";
    @NotNull
    public static final String l = "migration_overrides";
    @NotNull
    public static final String m = "{october_2012:true}";
    @NotNull
    public final Context a;
    @NotNull
    public final Uri b;
    @Nullable
    public final b c;
    public final boolean d;
    @NotNull
    public final Object e;

    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public final Context a;
        @NotNull
        public final Uri b;
        @Nullable
        public b c;
        public boolean d;
        @Nullable
        public Object e;

        public a(@NotNull Context context, @NotNull Uri uri) {
            C6562gT0.p(context, "context");
            C6562gT0.p(uri, "imageUri");
            this.a = context;
            this.b = uri;
        }

        public static /* synthetic */ a e(a aVar, Context context, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                context = aVar.a;
            }
            if ((i & 2) != 0) {
                uri = aVar.b;
            }
            return aVar.d(context, uri);
        }

        @NotNull
        public final M a() {
            Context context = this.a;
            Uri uri = this.b;
            b bVar = this.c;
            boolean z = this.d;
            Object obj = this.e;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new M(context, uri, bVar, z, obj, null);
        }

        public final Context b() {
            return this.a;
        }

        public final Uri c() {
            return this.b;
        }

        @NotNull
        public final a d(@NotNull Context context, @NotNull Uri uri) {
            C6562gT0.p(context, "context");
            C6562gT0.p(uri, "imageUri");
            return new a(context, uri);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C6562gT0.g(this.a, aVar.a) && C6562gT0.g(this.b, aVar.b);
            }
            return false;
        }

        @NotNull
        public final a f(boolean z) {
            this.d = z;
            return this;
        }

        @NotNull
        public final a g(@Nullable b bVar) {
            this.c = bVar;
            return this;
        }

        @NotNull
        public final a h(@Nullable Object obj) {
            this.e = obj;
            return this;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Builder(context=" + this.a + ", imageUri=" + this.b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(@Nullable N n);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final Uri a(@Nullable String str, int i, int i2) {
            return b(str, i, i2, "");
        }

        @InterfaceC9511sW0
        @NotNull
        public final Uri b(@Nullable String str, int i, int i2, @Nullable String str2) {
            m0 m0Var = m0.a;
            m0.t(str, MetaDataStore.c);
            boolean z = false;
            int max = Math.max(i, 0);
            int max2 = Math.max(i2, 0);
            if ((max == 0 && max2 == 0) ? true : true) {
                c0 c0Var = c0.a;
                Uri.Builder buildUpon = Uri.parse(c0.h()).buildUpon();
                C8319ne2 c8319ne2 = C8319ne2.a;
                Locale locale = Locale.US;
                com.facebook.M m = com.facebook.M.a;
                String format = String.format(locale, M.h, Arrays.copyOf(new Object[]{com.facebook.M.B(), str}, 2));
                C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
                Uri.Builder path = buildUpon.path(format);
                if (max2 != 0) {
                    path.appendQueryParameter("height", String.valueOf(max2));
                }
                if (max != 0) {
                    path.appendQueryParameter("width", String.valueOf(max));
                }
                path.appendQueryParameter(M.l, M.m);
                l0 l0Var = l0.a;
                if (!l0.f0(str2)) {
                    path.appendQueryParameter("access_token", str2);
                } else if (!l0.f0(com.facebook.M.v()) && !l0.f0(com.facebook.M.o())) {
                    path.appendQueryParameter("access_token", com.facebook.M.o() + '|' + com.facebook.M.v());
                } else {
                    Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
                }
                Uri build = path.build();
                C6562gT0.o(build, "builder.build()");
                return build;
            }
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }

        public c() {
        }
    }

    public /* synthetic */ M(Context context, Uri uri, b bVar, boolean z, Object obj, C9516sY c9516sY) {
        this(context, uri, bVar, z, obj);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Uri f(@Nullable String str, int i2, int i3) {
        return f.a(str, i2, i3);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Uri g(@Nullable String str, int i2, int i3, @Nullable String str2) {
        return f.b(str, i2, i3, str2);
    }

    public final boolean a() {
        return this.d;
    }

    @Nullable
    public final b b() {
        return this.c;
    }

    @NotNull
    public final Object c() {
        return this.e;
    }

    @NotNull
    public final Context d() {
        return this.a;
    }

    @NotNull
    public final Uri e() {
        return this.b;
    }

    public final boolean h() {
        return this.d;
    }

    public M(Context context, Uri uri, b bVar, boolean z, Object obj) {
        this.a = context;
        this.b = uri;
        this.c = bVar;
        this.d = z;
        this.e = obj;
    }
}
