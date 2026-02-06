package o;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.C0376a;
import com.facebook.S;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import o.C10673xH2;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.xH2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10673xH2 {
    @NotNull
    public static final a e = new a(null);
    @NotNull
    public static final String f;
    @NotNull
    public static final String g = "success";
    @NotNull
    public static final String h = "tree";
    @NotNull
    public static final String i = "app_version";
    @NotNull
    public static final String j = "platform";
    @NotNull
    public static final String k = "request_type";
    @Nullable
    public static C10673xH2 l;
    @NotNull
    public final Handler a;
    @NotNull
    public final WeakReference<Activity> b;
    @Nullable
    public Timer c;
    @Nullable
    public String d;

    /* renamed from: o.xH2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static final void c(com.facebook.Y y) {
            C6562gT0.p(y, "it");
            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, C10673xH2.e(), "App index sent to FB!");
        }

        @InterfaceC9511sW0
        @HT1({HT1.a.Y})
        @Nullable
        public final com.facebook.S b(@Nullable String str, @Nullable C0376a c0376a, @Nullable String str2, @NotNull String str3) {
            C6562gT0.p(str3, "requestType");
            if (str == null) {
                return null;
            }
            S.c cVar = com.facebook.S.n;
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            com.facebook.S N = cVar.N(c0376a, format, null, null);
            Bundle K = N.K();
            if (K == null) {
                K = new Bundle();
            }
            K.putString("tree", str);
            C5370bd c5370bd = C5370bd.a;
            K.putString("app_version", C5370bd.d());
            K.putString("platform", "android");
            K.putString(C10673xH2.k, str3);
            if (C6562gT0.g(str3, EK.l)) {
                SE se = SE.a;
                K.putString(EK.j, SE.g());
            }
            N.r0(K);
            N.l0(new S.b() { // from class: o.wH2
                @Override // com.facebook.S.b
                public final void a(com.facebook.Y y) {
                    C10673xH2.a.c(y);
                }
            });
            return N;
        }

        @InterfaceC9511sW0
        public final void d(@NotNull String str) {
            C6562gT0.p(str, "tree");
            C10673xH2 d = C10673xH2.d();
            if (d == null) {
                return;
            }
            C10673xH2.g(d, str);
        }

        public a() {
        }
    }

    /* renamed from: o.xH2$b */
    /* loaded from: classes2.dex */
    public static final class b implements Callable<String> {
        @NotNull
        public final WeakReference<View> a;

        public b(@NotNull View view) {
            C6562gT0.p(view, "rootView");
            this.a = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        @NotNull
        /* renamed from: a */
        public String call() {
            View view = this.a.get();
            if (view != null && view.getWidth() != 0 && view.getHeight() != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                C6562gT0.o(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
                return encodeToString;
            }
            return "";
        }
    }

    /* renamed from: o.xH2$c */
    /* loaded from: classes2.dex */
    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) C10673xH2.c(C10673xH2.this).get();
                C5370bd c5370bd = C5370bd.a;
                View e = C5370bd.e(activity);
                if (activity != null && e != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    SE se = SE.a;
                    if (SE.h()) {
                        com.facebook.internal.S s = com.facebook.internal.S.a;
                        if (com.facebook.internal.S.b()) {
                            C9670tA2 c9670tA2 = C9670tA2.a;
                            C9670tA2.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(e));
                        C10673xH2.f(C10673xH2.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e2) {
                            Log.e(C10673xH2.e(), "Failed to take screenshot.", e2);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(C9698tH2.z, simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            C9455sH2 c9455sH2 = C9455sH2.a;
                            jSONArray.put(C9455sH2.d(e));
                            jSONObject.put(C9698tH2.A, jSONArray);
                        } catch (JSONException unused) {
                            Log.e(C10673xH2.e(), "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        C6562gT0.o(jSONObject2, "viewTree.toString()");
                        C10673xH2.g(C10673xH2.this, jSONObject2);
                    }
                }
            } catch (Exception e3) {
                Log.e(C10673xH2.e(), "UI Component tree indexing failure!", e3);
            }
        }
    }

    static {
        String canonicalName = C10673xH2.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f = canonicalName;
    }

    public C10673xH2(@NotNull Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        this.b = new WeakReference<>(activity);
        this.d = null;
        this.a = new Handler(Looper.getMainLooper());
        l = this;
    }

    public static final /* synthetic */ WeakReference c(C10673xH2 c10673xH2) {
        if (SQ.e(C10673xH2.class)) {
            return null;
        }
        try {
            return c10673xH2.b;
        } catch (Throwable th) {
            SQ.c(th, C10673xH2.class);
            return null;
        }
    }

    public static final /* synthetic */ C10673xH2 d() {
        if (SQ.e(C10673xH2.class)) {
            return null;
        }
        try {
            return l;
        } catch (Throwable th) {
            SQ.c(th, C10673xH2.class);
            return null;
        }
    }

    public static final /* synthetic */ String e() {
        if (SQ.e(C10673xH2.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            SQ.c(th, C10673xH2.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler f(C10673xH2 c10673xH2) {
        if (SQ.e(C10673xH2.class)) {
            return null;
        }
        try {
            return c10673xH2.a;
        } catch (Throwable th) {
            SQ.c(th, C10673xH2.class);
            return null;
        }
    }

    public static final /* synthetic */ void g(C10673xH2 c10673xH2, String str) {
        if (SQ.e(C10673xH2.class)) {
            return;
        }
        try {
            c10673xH2.l(str);
        } catch (Throwable th) {
            SQ.c(th, C10673xH2.class);
        }
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Y})
    @Nullable
    public static final com.facebook.S h(@Nullable String str, @Nullable C0376a c0376a, @Nullable String str2, @NotNull String str3) {
        if (SQ.e(C10673xH2.class)) {
            return null;
        }
        try {
            return e.b(str, c0376a, str2, str3);
        } catch (Throwable th) {
            SQ.c(th, C10673xH2.class);
            return null;
        }
    }

    public static final void k(C10673xH2 c10673xH2, TimerTask timerTask) {
        if (!SQ.e(C10673xH2.class)) {
            try {
                C6562gT0.p(c10673xH2, "this$0");
                C6562gT0.p(timerTask, "$indexingTask");
                try {
                    Timer timer = c10673xH2.c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    c10673xH2.d = null;
                    Timer timer2 = new Timer();
                    timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                    c10673xH2.c = timer2;
                } catch (Exception e2) {
                    Log.e(f, "Error scheduling indexing job", e2);
                }
            } catch (Throwable th) {
                SQ.c(th, C10673xH2.class);
            }
        }
    }

    public static final void m(String str, C10673xH2 c10673xH2) {
        if (!SQ.e(C10673xH2.class)) {
            try {
                C6562gT0.p(str, "$tree");
                C6562gT0.p(c10673xH2, "this$0");
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                String p0 = com.facebook.internal.l0.p0(str);
                C0376a i2 = C0376a.g1.i();
                if (p0 != null && C6562gT0.g(p0, c10673xH2.d)) {
                    return;
                }
                a aVar = e;
                com.facebook.M m = com.facebook.M.a;
                c10673xH2.i(aVar.b(str, i2, com.facebook.M.o(), EK.l), p0);
            } catch (Throwable th) {
                SQ.c(th, C10673xH2.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void n(@NotNull String str) {
        if (SQ.e(C10673xH2.class)) {
            return;
        }
        try {
            e.d(str);
        } catch (Throwable th) {
            SQ.c(th, C10673xH2.class);
        }
    }

    public final void i(@Nullable com.facebook.S s, @Nullable String str) {
        if (!SQ.e(this) && s != null) {
            try {
                com.facebook.Y l2 = s.l();
                try {
                    JSONObject i2 = l2.i();
                    if (i2 != null) {
                        if (C6562gT0.g("true", i2.optString("success"))) {
                            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, f, "Successfully send UI component tree to server");
                            this.d = str;
                        }
                        if (i2.has(EK.i)) {
                            boolean z = i2.getBoolean(EK.i);
                            SE se = SE.a;
                            SE.n(z);
                            return;
                        }
                        return;
                    }
                    Log.e(f, C6562gT0.C("Error sending UI component tree to Facebook: ", l2.g()));
                } catch (JSONException e2) {
                    Log.e(f, "Error decoding server response.", e2);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void j() {
        if (!SQ.e(this)) {
            try {
                final c cVar = new c();
                try {
                    com.facebook.M m = com.facebook.M.a;
                    com.facebook.M.y().execute(new Runnable() { // from class: o.uH2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10673xH2.k(C10673xH2.this, cVar);
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    Log.e(f, "Error scheduling indexing job", e2);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void l(final String str) {
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.M m = com.facebook.M.a;
            com.facebook.M.y().execute(new Runnable() { // from class: o.vH2
                @Override // java.lang.Runnable
                public final void run() {
                    C10673xH2.m(str, this);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void o() {
        if (!SQ.e(this)) {
            try {
                if (this.b.get() != null) {
                    try {
                        Timer timer = this.c;
                        if (timer != null) {
                            timer.cancel();
                        }
                        this.c = null;
                    } catch (Exception e2) {
                        Log.e(f, "Error unscheduling indexing job", e2);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
