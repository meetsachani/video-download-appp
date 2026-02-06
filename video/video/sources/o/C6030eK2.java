package o;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.eK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6030eK2 {
    public static final String b = "WebViewAssetLoader";
    public static final String c = "appassets.androidplatform.net";
    public final List<e> a;

    /* renamed from: o.eK2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public boolean a;
        public String b = C6030eK2.c;
        public final List<C4377Tx1<String, d>> c = new ArrayList();

        public b a(String str, d dVar) {
            this.c.add(C4377Tx1.a(str, dVar));
            return this;
        }

        public C6030eK2 b() {
            ArrayList arrayList = new ArrayList();
            for (C4377Tx1<String, d> c4377Tx1 : this.c) {
                arrayList.add(new e(this.b, c4377Tx1.a, this.a, c4377Tx1.b));
            }
            return new C6030eK2(arrayList);
        }

        public b c(String str) {
            this.b = str;
            return this;
        }

        public b d(boolean z) {
            this.a = z;
            return this;
        }
    }

    /* renamed from: o.eK2$c */
    /* loaded from: classes.dex */
    public static final class c implements d {
        public static final String[] b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        public final File a;

        public c(Context context, File file) {
            try {
                this.a = new File(C10517wf.a(file));
                if (b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
            }
        }

        @Override // o.C6030eK2.d
        public WebResourceResponse a(String str) {
            File b2;
            try {
                b2 = C10517wf.b(this.a, str);
            } catch (IOException e) {
                Log.e(C6030eK2.b, "Error opening the requested path: " + str, e);
            }
            if (b2 != null) {
                return new WebResourceResponse(C10517wf.f(str), null, C10517wf.i(b2));
            }
            Log.e(C6030eK2.b, String.format("The requested file: %s is outside the mounted directory: %s", str, this.a));
            return new WebResourceResponse(null, null, null);
        }

        public final boolean b(Context context) throws IOException {
            String a = C10517wf.a(this.a);
            String a2 = C10517wf.a(context.getCacheDir());
            String a3 = C10517wf.a(C10517wf.c(context));
            if ((!a.startsWith(a2) && !a.startsWith(a3)) || a.equals(a2) || a.equals(a3)) {
                return false;
            }
            for (String str : b) {
                if (a.startsWith(a3 + str)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: o.eK2$d */
    /* loaded from: classes.dex */
    public interface d {
        WebResourceResponse a(String str);
    }

    /* renamed from: o.eK2$e */
    /* loaded from: classes.dex */
    public static class e {
        public static final String e = "http";
        public static final String f = "https";
        public final boolean a;
        public final String b;
        public final String c;
        public final d d;

        public e(String str, String str2, boolean z, d dVar) {
            if (!str2.isEmpty() && str2.charAt(0) == '/') {
                if (str2.endsWith(RemoteSettings.i)) {
                    this.b = str;
                    this.c = str2;
                    this.a = z;
                    this.d = dVar;
                    return;
                }
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }

        public String a(String str) {
            return str.replaceFirst(this.c, "");
        }

        public d b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.a) {
                return null;
            }
            if ((!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) || !uri.getAuthority().equals(this.b) || !uri.getPath().startsWith(this.c)) {
                return null;
            }
            return this.d;
        }
    }

    public C6030eK2(List<e> list) {
        this.a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse a2;
        for (e eVar : this.a) {
            d b2 = eVar.b(uri);
            if (b2 != null && (a2 = b2.a(eVar.a(uri.getPath()))) != null) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: o.eK2$a */
    /* loaded from: classes.dex */
    public static final class a implements d {
        public C10517wf a;

        public a(Context context) {
            this.a = new C10517wf(context);
        }

        @Override // o.C6030eK2.d
        public WebResourceResponse a(String str) {
            try {
                return new WebResourceResponse(C10517wf.f(str), null, this.a.h(str));
            } catch (IOException e) {
                Log.e(C6030eK2.b, "Error opening asset path: " + str, e);
                return new WebResourceResponse(null, null, null);
            }
        }

        public a(C10517wf c10517wf) {
            this.a = c10517wf;
        }
    }

    /* renamed from: o.eK2$f */
    /* loaded from: classes.dex */
    public static final class f implements d {
        public C10517wf a;

        public f(Context context) {
            this.a = new C10517wf(context);
        }

        @Override // o.C6030eK2.d
        public WebResourceResponse a(String str) {
            try {
                return new WebResourceResponse(C10517wf.f(str), null, this.a.j(str));
            } catch (Resources.NotFoundException e) {
                Log.e(C6030eK2.b, "Resource not found from the path: " + str, e);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e2) {
                Log.e(C6030eK2.b, "Error opening resource from the path: " + str, e2);
                return new WebResourceResponse(null, null, null);
            }
        }

        public f(C10517wf c10517wf) {
            this.a = c10517wf;
        }
    }
}
