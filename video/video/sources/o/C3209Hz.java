package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import o.AbstractC2675Cp1;
import o.AbstractC4995a41;
import o.C3209Hz;
import o.HD;
import o.M31;

/* renamed from: o.Hz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3209Hz implements InterfaceC3682Mt2 {
    public static final String A = "fingerprint";
    public static final String B = "locale";
    public static final String C = "country";
    public static final String D = "mcc_mnc";
    public static final String E = "tz-offset";
    public static final String F = "application_build";
    public static final String h = "CctTransportBackend";
    public static final int i = 30000;
    public static final int j = 130000;
    public static final int k = -1;
    public static final String l = "Accept-Encoding";
    public static final String m = "Content-Encoding";
    public static final String n = "gzip";

    /* renamed from: o  reason: collision with root package name */
    public static final String f491o = "Content-Type";
    public static final String p = "X-Goog-Api-Key";
    public static final String q = "application/json";
    @InterfaceC5056aJ2
    public static final String r = "net-type";
    @InterfaceC5056aJ2
    public static final String s = "mobile-subtype";
    public static final String t = "sdk-version";
    public static final String u = "model";
    public static final String v = "hardware";
    public static final String w = "device";
    public static final String x = "product";
    public static final String y = "os-uild";
    public static final String z = "manufacturer";
    public final DataEncoder a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final ND e;
    public final ND f;
    public final int g;

    /* renamed from: o.Hz$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final URL a;
        public final AbstractC6133em b;
        @InterfaceC11300zs1
        public final String c;

        public a(URL url, AbstractC6133em abstractC6133em, @InterfaceC11300zs1 String str) {
            this.a = url;
            this.b = abstractC6133em;
            this.c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* renamed from: o.Hz$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        @InterfaceC11300zs1
        public final URL b;
        public final long c;

        public b(int i, @InterfaceC11300zs1 URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public C3209Hz(Context context, ND nd, ND nd2, int i2) {
        this.a = AbstractC6133em.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = m(C11298zs.d);
        this.e = nd2;
        this.f = nd;
        this.g = i2;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.b;
        if (url != null) {
            C7676l41.c(h, "Following redirect to: %s", url);
            return aVar.a(bVar.b);
        }
        return null;
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC2675Cp1.b.UNKNOWN_MOBILE_SUBTYPE.g();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC2675Cp1.b.COMBINED.g();
        }
        if (AbstractC2675Cp1.b.e(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC2675Cp1.c.NONE.g();
        }
        return networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C7676l41.f(h, "Unable to find version code for package", e);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @InterfaceC5056aJ2
    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream l(InputStream inputStream, String str) throws IOException {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    public static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // o.InterfaceC3682Mt2
    public AbstractC10291vk a(AbstractC10048uk abstractC10048uk) {
        AbstractC6133em i2 = i(abstractC10048uk);
        URL url = this.d;
        String str = null;
        if (abstractC10048uk.d() != null) {
            try {
                C11298zs e = C11298zs.e(abstractC10048uk.d());
                if (e.f() != null) {
                    str = e.f();
                }
                if (e.g() != null) {
                    url = m(e.g());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC10291vk.a();
            }
        }
        try {
            b bVar = (b) C8041mU1.a(5, new a(url, i2, str), new WA0() { // from class: o.Fz
                @Override // o.WA0
                public final Object apply(Object obj) {
                    C3209Hz.b e2;
                    e2 = C3209Hz.this.e((C3209Hz.a) obj);
                    return e2;
                }
            }, new InterfaceC8771pU1() { // from class: o.Gz
                @Override // o.InterfaceC8771pU1
                public final Object a(Object obj, Object obj2) {
                    return C3209Hz.d((C3209Hz.a) obj, (C3209Hz.b) obj2);
                }
            });
            int i3 = bVar.a;
            if (i3 == 200) {
                return AbstractC10291vk.e(bVar.c);
            }
            if (i3 < 500 && i3 != 404) {
                if (i3 == 400) {
                    return AbstractC10291vk.d();
                }
                return AbstractC10291vk.a();
            }
            return AbstractC10291vk.f();
        } catch (IOException e2) {
            C7676l41.f(h, "Could not make request to the backend", e2);
            return AbstractC10291vk.f();
        }
    }

    @Override // o.InterfaceC3682Mt2
    public AbstractC3033Ge0 b(AbstractC3033Ge0 abstractC3033Ge0) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return abstractC3033Ge0.n().a(t, Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c(x, Build.PRODUCT).c(y, Build.ID).c(z, Build.MANUFACTURER).c(A, Build.FINGERPRINT).b(E, k()).a(r, g(activeNetworkInfo)).a(s, f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c(D, j(this.c).getSimOperator()).c(F, Integer.toString(h(this.c))).d();
    }

    public final b e(a aVar) throws IOException {
        C7676l41.h(h, "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(Q32.j);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C7676l41.h(h, "Status Code: %d", Integer.valueOf(responseCode));
                C7676l41.c(h, "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                C7676l41.c(h, "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream l2 = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        b bVar = new b(responseCode, null, AbstractC5238b41.b(new BufferedReader(new InputStreamReader(l2))).c());
                        if (l2 != null) {
                            l2.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return bVar;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            C7676l41.f(h, "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            C7676l41.f(h, "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            C7676l41.f(h, "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            C7676l41.f(h, "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final AbstractC6133em i(AbstractC10048uk abstractC10048uk) {
        M31.a j2;
        HashMap hashMap = new HashMap();
        for (AbstractC3033Ge0 abstractC3033Ge0 : abstractC10048uk.c()) {
            String l2 = abstractC3033Ge0.l();
            if (!hashMap.containsKey(l2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC3033Ge0);
                hashMap.put(l2, arrayList);
            } else {
                ((List) hashMap.get(l2)).add(abstractC3033Ge0);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC3033Ge0 abstractC3033Ge02 = (AbstractC3033Ge0) ((List) entry.getValue()).get(0);
            AbstractC4995a41.a b2 = AbstractC4995a41.a().f(YK1.DEFAULT).g(this.f.a()).h(this.e.a()).b(HD.a().c(HD.b.ANDROID_FIREBASE).b(V8.a().m(Integer.valueOf(abstractC3033Ge02.g(t))).j(abstractC3033Ge02.b("model")).f(abstractC3033Ge02.b("hardware")).d(abstractC3033Ge02.b("device")).l(abstractC3033Ge02.b(x)).k(abstractC3033Ge02.b(y)).h(abstractC3033Ge02.b(z)).e(abstractC3033Ge02.b(A)).c(abstractC3033Ge02.b("country")).g(abstractC3033Ge02.b("locale")).i(abstractC3033Ge02.b(D)).b(abstractC3033Ge02.b(F)).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC3033Ge0 abstractC3033Ge03 : (List) entry.getValue()) {
                C10988yb0 e = abstractC3033Ge03.e();
                C3123Hc0 b3 = e.b();
                if (b3.equals(C3123Hc0.b("proto"))) {
                    j2 = M31.j(e.a());
                } else if (b3.equals(C3123Hc0.b(com.facebook.S.B))) {
                    j2 = M31.i(new String(e.a(), Charset.forName("UTF-8")));
                } else {
                    C7676l41.i(h, "Received event of unsupported encoding %s. Skipping...", b3);
                }
                j2.c(abstractC3033Ge03.f()).d(abstractC3033Ge03.m()).h(abstractC3033Ge03.h(E)).e(AbstractC2675Cp1.a().c(AbstractC2675Cp1.c.e(abstractC3033Ge03.g(r))).b(AbstractC2675Cp1.b.e(abstractC3033Ge03.g(s))).a());
                if (abstractC3033Ge03.d() != null) {
                    j2.b(abstractC3033Ge03.d());
                }
                arrayList3.add(j2.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return AbstractC6133em.a(arrayList2);
    }

    public C3209Hz(Context context, ND nd, ND nd2) {
        this(context, nd, nd2, j);
    }
}
