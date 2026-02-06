package o;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AbstractC2355i;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.InterfaceC2411u;
import com.facebook.S;
import com.facebook.internal.t0;
import com.facebook.share.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TG2 {
    public static final String a = "VideoUploader";
    public static final String b = "upload_phase";
    public static final String c = "start";
    public static final String d = "transfer";
    public static final String e = "finish";
    public static final String f = "title";
    public static final String g = "description";
    public static final String h = "ref";
    public static final String i = "file_size";
    public static final String j = "upload_session_id";
    public static final String k = "video_id";
    public static final String l = "start_offset";
    public static final String m = "end_offset";
    public static final String n = "video_file_chunk";

    /* renamed from: o  reason: collision with root package name */
    public static final String f618o = "Video upload failed";
    public static final String p = "Unexpected error in server response";
    public static final int q = 8;
    public static final int r = 2;
    public static final int s = 5000;
    public static final int t = 3;
    public static boolean u;
    public static Handler v;
    public static com.facebook.internal.t0 w = new com.facebook.internal.t0(8);
    public static Set<e> x = new HashSet();
    public static AbstractC2355i y;

    /* loaded from: classes2.dex */
    public class a extends AbstractC2355i {
        @Override // com.facebook.AbstractC2355i
        public void d(C0376a oldAccessToken, C0376a currentAccessToken) {
            if (oldAccessToken != null) {
                if (currentAccessToken == null || !com.facebook.internal.l0.e(currentAccessToken.y(), oldAccessToken.y())) {
                    TG2.i();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends f {
        public static final Set<Integer> Y0 = new a();

        /* loaded from: classes2.dex */
        public class a extends HashSet<Integer> {
            public a() {
                add(1363011);
            }
        }

        public b(e uploadContext, int completedRetries) {
            super(uploadContext, completedRetries);
        }

        @Override // o.TG2.f
        public void c(int retriesCompleted) {
            TG2.l(this.X, retriesCompleted);
        }

        @Override // o.TG2.f
        public Bundle e() {
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.X.p;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putString(TG2.b, TG2.e);
            bundle.putString(TG2.j, this.X.i);
            com.facebook.internal.l0.u0(bundle, "title", this.X.b);
            com.facebook.internal.l0.u0(bundle, "description", this.X.c);
            com.facebook.internal.l0.u0(bundle, "ref", this.X.d);
            return bundle;
        }

        @Override // o.TG2.f
        public Set<Integer> f() {
            return Y0;
        }

        @Override // o.TG2.f
        public void g(C2416z error) {
            TG2.q(error, "Video '%s' failed to finish uploading", this.X.j);
            b(error);
        }

        @Override // o.TG2.f
        public void h(JSONObject jsonObject) throws JSONException {
            if (jsonObject.getBoolean("success")) {
                i(null, this.X.j);
            } else {
                g(new C2416z(TG2.p));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends f {
        public static final Set<Integer> Y0 = new a();

        /* loaded from: classes2.dex */
        public class a extends HashSet<Integer> {
            public a() {
                add(6000);
            }
        }

        public c(e uploadContext, int completedRetries) {
            super(uploadContext, completedRetries);
        }

        @Override // o.TG2.f
        public void c(int retriesCompleted) {
            TG2.m(this.X, retriesCompleted);
        }

        @Override // o.TG2.f
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putString(TG2.b, "start");
            bundle.putLong(TG2.i, this.X.l);
            return bundle;
        }

        @Override // o.TG2.f
        public Set<Integer> f() {
            return Y0;
        }

        @Override // o.TG2.f
        public void g(C2416z error) {
            TG2.q(error, "Error starting video upload", new Object[0]);
            b(error);
        }

        @Override // o.TG2.f
        public void h(JSONObject jsonObject) throws JSONException {
            this.X.i = jsonObject.getString(TG2.j);
            this.X.j = jsonObject.getString(TG2.k);
            String string = jsonObject.getString(TG2.l);
            String string2 = jsonObject.getString(TG2.m);
            if (this.X.h != null) {
                long parseLong = Long.parseLong(string);
                e eVar = this.X;
                eVar.h.b(parseLong, eVar.l);
            }
            TG2.k(this.X, string, string2, 0);
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends f {
        public static final Set<Integer> a1 = new a();
        public String Y0;
        public String Z0;

        /* loaded from: classes2.dex */
        public class a extends HashSet<Integer> {
            public a() {
                add(1363019);
                add(1363021);
                add(1363030);
                add(1363033);
                add(1363041);
            }
        }

        public d(e uploadContext, String chunkStart, String chunkEnd, int completedRetries) {
            super(uploadContext, completedRetries);
            this.Y0 = chunkStart;
            this.Z0 = chunkEnd;
        }

        @Override // o.TG2.f
        public void c(int retriesCompleted) {
            TG2.k(this.X, this.Y0, this.Z0, retriesCompleted);
        }

        @Override // o.TG2.f
        public Bundle e() throws IOException {
            Bundle bundle = new Bundle();
            bundle.putString(TG2.b, TG2.d);
            bundle.putString(TG2.j, this.X.i);
            bundle.putString(TG2.l, this.Y0);
            byte[] n = TG2.n(this.X, this.Y0, this.Z0);
            if (n != null) {
                bundle.putByteArray(TG2.n, n);
                return bundle;
            }
            throw new C2416z("Error reading video");
        }

        @Override // o.TG2.f
        public Set<Integer> f() {
            return a1;
        }

        @Override // o.TG2.f
        public void g(C2416z error) {
            TG2.q(error, "Error uploading video '%s'", this.X.j);
            b(error);
        }

        @Override // o.TG2.f
        public void h(JSONObject jsonObject) throws JSONException {
            String string = jsonObject.getString(TG2.l);
            String string2 = jsonObject.getString(TG2.m);
            if (this.X.h != null) {
                long parseLong = Long.parseLong(string);
                e eVar = this.X;
                eVar.h.b(parseLong, eVar.l);
            }
            if (com.facebook.internal.l0.e(string, string2)) {
                TG2.l(this.X, 0);
            } else {
                TG2.k(this.X, string, string2, 0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class e {
        public final Uri a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final C0376a f;
        public final InterfaceC2411u<e.a> g;
        public final S.g h;
        public String i;
        public String j;
        public InputStream k;
        public long l;
        public String m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public t0.b f619o;
        public Bundle p;

        public /* synthetic */ e(S32 s32, String str, InterfaceC2411u interfaceC2411u, S.g gVar, a aVar) {
            this(s32, str, interfaceC2411u, gVar);
        }

        public final void b() throws FileNotFoundException {
            try {
                if (com.facebook.internal.l0.d0(this.a)) {
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(new File(this.a.getPath()), 268435456);
                    this.l = open.getStatSize();
                    this.k = new ParcelFileDescriptor.AutoCloseInputStream(open);
                } else if (com.facebook.internal.l0.a0(this.a)) {
                    this.l = com.facebook.internal.l0.A(this.a);
                    this.k = com.facebook.M.n().getContentResolver().openInputStream(this.a);
                } else {
                    throw new C2416z("Uri must be a content:// or file:// uri");
                }
            } catch (FileNotFoundException e) {
                com.facebook.internal.l0.j(this.k);
                throw e;
            }
        }

        public e(S32 videoContent, String graphNode, InterfaceC2411u<e.a> callback, S.g progressCallback) {
            this.m = "0";
            this.f = C0376a.k();
            this.a = videoContent.n().d();
            this.b = videoContent.k();
            this.c = videoContent.h();
            this.d = videoContent.e();
            this.e = graphNode;
            this.g = callback;
            this.h = progressCallback;
            this.p = videoContent.n().c();
            if (!com.facebook.internal.l0.g0(videoContent.c())) {
                this.p.putString("tags", TextUtils.join(C6566gU0.h, videoContent.c()));
            }
            if (!com.facebook.internal.l0.f0(videoContent.d())) {
                this.p.putString("place", videoContent.d());
            }
            if (com.facebook.internal.l0.f0(videoContent.e())) {
                return;
            }
            this.p.putString("ref", videoContent.e());
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f implements Runnable {
        public e X;
        public int Y;
        public com.facebook.Y Z;

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SQ.e(this)) {
                    return;
                }
                try {
                    f fVar = f.this;
                    fVar.c(fVar.Y + 1);
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }

        /* loaded from: classes2.dex */
        public class b implements Runnable {
            public final /* synthetic */ C2416z X;
            public final /* synthetic */ String Y;

            public b(final C2416z val$error, final String val$videoId) {
                this.X = val$error;
                this.Y = val$videoId;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SQ.e(this)) {
                    return;
                }
                try {
                    f fVar = f.this;
                    TG2.p(fVar.X, this.X, fVar.Z, this.Y);
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }

        public f(e uploadContext, int completedRetries) {
            this.X = uploadContext;
            this.Y = completedRetries;
        }

        public final boolean a(int errorCode) {
            if (this.Y < 2 && f().contains(Integer.valueOf(errorCode))) {
                TG2.g().postDelayed(new a(), ((int) Math.pow(3.0d, this.Y)) * 5000);
                return true;
            }
            return false;
        }

        public void b(C2416z error) {
            i(error, null);
        }

        public abstract void c(int retriesCompleted);

        public void d(Bundle parameters) {
            e eVar = this.X;
            com.facebook.Y l = new com.facebook.S(eVar.f, String.format(Locale.ROOT, "%s/videos", eVar.e), parameters, com.facebook.Z.POST, null).l();
            this.Z = l;
            if (l != null) {
                com.facebook.C g = l.g();
                JSONObject i = this.Z.i();
                if (g != null) {
                    if (!a(g.v())) {
                        g(new com.facebook.A(this.Z, TG2.f618o));
                        return;
                    }
                    return;
                } else if (i != null) {
                    try {
                        h(i);
                        return;
                    } catch (JSONException e) {
                        b(new C2416z(TG2.p, e));
                        return;
                    }
                } else {
                    g(new C2416z(TG2.p));
                    return;
                }
            }
            g(new C2416z(TG2.p));
        }

        public abstract Bundle e() throws Exception;

        public abstract Set<Integer> f();

        public abstract void g(C2416z error);

        public abstract void h(JSONObject jsonObject) throws JSONException;

        public void i(final C2416z error, final String videoId) {
            TG2.g().post(new b(error, videoId));
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SQ.e(this)) {
                try {
                    if (!this.X.n) {
                        try {
                            try {
                                d(e());
                                return;
                            } catch (Exception e) {
                                b(new C2416z(TG2.f618o, e));
                                return;
                            }
                        } catch (C2416z e2) {
                            b(e2);
                            return;
                        }
                    }
                    b(null);
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    public static /* synthetic */ Handler g() {
        return o();
    }

    public static synchronized void i() {
        synchronized (TG2.class) {
            for (e eVar : x) {
                eVar.n = true;
            }
        }
    }

    public static synchronized void j(e uploadContext, Runnable workItem) {
        synchronized (TG2.class) {
            uploadContext.f619o = w.e(workItem);
        }
    }

    public static void k(e uploadContext, String chunkStart, String chunkEnd, int completedRetries) {
        j(uploadContext, new d(uploadContext, chunkStart, chunkEnd, completedRetries));
    }

    public static void l(e uploadContext, int completedRetries) {
        j(uploadContext, new b(uploadContext, completedRetries));
    }

    public static void m(e uploadContext, int completedRetries) {
        j(uploadContext, new c(uploadContext, completedRetries));
    }

    public static byte[] n(e uploadContext, String chunkStart, String chunkEnd) throws IOException {
        int read;
        if (!com.facebook.internal.l0.e(chunkStart, uploadContext.m)) {
            q(null, "Error reading video chunk. Expected chunk '%s'. Requested chunk '%s'.", uploadContext.m, chunkStart);
            return null;
        }
        int parseLong = (int) (Long.parseLong(chunkEnd) - Long.parseLong(chunkStart));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Math.min(8192, parseLong)];
        do {
            read = uploadContext.k.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                parseLong -= read;
                if (parseLong == 0) {
                }
            }
            uploadContext.m = chunkEnd;
            return byteArrayOutputStream.toByteArray();
        } while (parseLong >= 0);
        q(null, "Error reading video chunk. Expected buffer length - '%d'. Actual - '%d'.", Integer.valueOf(parseLong + read), Integer.valueOf(read));
        return null;
    }

    public static synchronized Handler o() {
        Handler handler;
        synchronized (TG2.class) {
            try {
                if (v == null) {
                    v = new Handler(Looper.getMainLooper());
                }
                handler = v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static void p(final e uploadContext, final C2416z error, final com.facebook.Y response, final String videoId) {
        s(uploadContext);
        com.facebook.internal.l0.j(uploadContext.k);
        InterfaceC2411u<e.a> interfaceC2411u = uploadContext.g;
        if (interfaceC2411u != null) {
            if (error != null) {
                D32.v(interfaceC2411u, error);
            } else if (uploadContext.n) {
                D32.u(interfaceC2411u);
            } else {
                D32.y(interfaceC2411u, videoId);
            }
        }
        if (uploadContext.h != null) {
            if (response != null) {
                try {
                    if (response.i() != null) {
                        response.i().put(k, videoId);
                    }
                } catch (JSONException unused) {
                }
            }
            uploadContext.h.a(response);
        }
    }

    public static void q(Exception e2, String format, Object... args) {
        Log.e(a, String.format(Locale.ROOT, format, args), e2);
    }

    public static void r() {
        y = new a();
    }

    public static synchronized void s(e uploadContext) {
        synchronized (TG2.class) {
            x.remove(uploadContext);
        }
    }

    public static synchronized void t(S32 videoContent, String graphNode, InterfaceC2411u<e.a> callback) throws FileNotFoundException {
        synchronized (TG2.class) {
            u(videoContent, graphNode, callback, null);
        }
    }

    public static synchronized void u(S32 videoContent, String graphNode, InterfaceC2411u<e.a> callback, S.g progressCallback) throws FileNotFoundException {
        synchronized (TG2.class) {
            try {
                if (!u) {
                    r();
                    u = true;
                }
                com.facebook.internal.m0.s(videoContent, "videoContent");
                com.facebook.internal.m0.s(graphNode, "graphNode");
                R32 n2 = videoContent.n();
                com.facebook.internal.m0.s(n2, "videoContent.video");
                com.facebook.internal.m0.s(n2.d(), "videoContent.video.localUrl");
                e eVar = new e(videoContent, graphNode, callback, progressCallback, null);
                eVar.b();
                x.add(eVar);
                m(eVar, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void v(S32 videoContent, S.g callback) throws FileNotFoundException {
        synchronized (TG2.class) {
            u(videoContent, "me", null, callback);
        }
    }

    public static synchronized void w(S32 videoContent, String graphNode, S.g callback) throws FileNotFoundException {
        synchronized (TG2.class) {
            u(videoContent, graphNode, null, callback);
        }
    }
}
