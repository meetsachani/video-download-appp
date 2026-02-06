package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import o.AbstractC10026ue1;
import o.C9998uW1;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.InterfaceC8557od0;
import o.JK1;
import o.R5;

/* loaded from: classes3.dex */
public final class zznd extends zzic {
    public static final String[] i = {"firebase_", "google_", "ga_"};
    public static final String[] j = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public AbstractC10026ue1 f;
    public Boolean g;
    public Integer h;

    public zznd(zzhf zzhfVar) {
        super(zzhfVar);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    public static long A(zzbb zzbbVar) {
        long j2 = 0;
        if (zzbbVar == null) {
            return 0L;
        }
        Iterator<String> it = zzbbVar.iterator();
        while (it.hasNext()) {
            Object I0 = zzbbVar.I0(it.next());
            if (I0 instanceof Parcelable[]) {
                j2 += ((Parcelable[]) I0).length;
            }
        }
        return j2;
    }

    @InterfaceC5056aJ2
    public static long B(byte[] bArr) {
        boolean z;
        Preconditions.r(bArr);
        int i2 = 0;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.x(z);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (bArr[length] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public static boolean B0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static Bundle D(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static boolean D0(String str) {
        String a = zzbi.b0.a(null);
        if (!a.equals("*") && !Arrays.asList(a.split(",")).contains(str)) {
            return false;
        }
        return true;
    }

    public static Bundle F(List<zznc> list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            for (zznc zzncVar : list) {
                String str = zzncVar.a1;
                if (str != null) {
                    bundle.putString(zzncVar.Y, str);
                } else {
                    Long l = zzncVar.Y0;
                    if (l != null) {
                        bundle.putLong(zzncVar.Y, l.longValue());
                    } else {
                        Double d = zzncVar.c1;
                        if (d != null) {
                            bundle.putDouble(zzncVar.Y, d.doubleValue());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static boolean H0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith(CrashlyticsReportPersistence.m)) {
            return true;
        }
        return false;
    }

    public static String I(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i2) {
            if (!z) {
                return null;
            }
            String substring = str.substring(0, str.offsetByCodePoints(0, i2));
            return substring + "...";
        }
        return str;
    }

    public static boolean J0(String str) {
        Preconditions.l(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static void K(Bundle bundle, int i2, String str, String str2, Object obj) {
        if (v0(bundle, i2)) {
            bundle.putString("_ev", I(str, 40, true));
            if (obj != null) {
                Preconditions.r(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean L0(String str) {
        for (String str2 : j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static int O0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if ("_lgclid".equals(str) || "_gbraid".equals(str)) {
            return 100;
        }
        return 36;
    }

    @InterfaceC5056aJ2
    private static boolean R0(String str) {
        Preconditions.r(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static MessageDigest T0() {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @InterfaceC10697xN2
    public static void W(zzki zzkiVar, Bundle bundle, boolean z) {
        if (bundle != null && zzkiVar != null && (!bundle.containsKey("_sc") || z)) {
            String str = zzkiVar.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = zzkiVar.b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", zzkiVar.c);
        } else if (bundle != null && zzkiVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void X(zznf zznfVar, int i2, String str, String str2, int i3) {
        Y(zznfVar, null, i2, str, str2, i3);
    }

    @InterfaceC10697xN2
    @TargetApi(30)
    private final boolean X0() {
        Integer num;
        if (this.g == null) {
            AbstractC10026ue1 Q0 = Q0();
            boolean z = false;
            if (Q0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = Q0.c().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        j().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (CancellationException e2) {
                        e = e2;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        j().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (ExecutionException e3) {
                        e = e3;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        j().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (TimeoutException e4) {
                        e = e4;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        j().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    }
                }
                this.g = Boolean.valueOf(z);
            } catch (InterruptedException e5) {
                e = e5;
            } catch (CancellationException e6) {
                e = e6;
            } catch (ExecutionException e7) {
                e = e7;
            } catch (TimeoutException e8) {
                e = e8;
            }
            j().K().b("Measurement manager api status result", num);
        }
        return this.g.booleanValue();
    }

    public static void Y(zznf zznfVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        v0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        zznfVar.b(str, "_err", bundle);
    }

    public static boolean c0(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.r(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean d0(Context context, boolean z) {
        Preconditions.r(context);
        return B0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean e0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
            return false;
        }
        return true;
    }

    public static boolean f0(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    public static boolean g0(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static boolean l0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.r(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (!TextUtils.isEmpty(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (!isEmpty && isEmpty2) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean m0(String str, String[] strArr) {
        Preconditions.r(strArr);
        for (String str2 : strArr) {
            if (zzng.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] p0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> t0(List<zzad> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzad zzadVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzadVar.X);
            bundle.putString("origin", zzadVar.Y);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.m, zzadVar.Y0);
            bundle.putString("name", zzadVar.Z.Y);
            zzie.b(bundle, Preconditions.r(zzadVar.Z.m0()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.n, zzadVar.Z0);
            String str = zzadVar.a1;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.d, str);
            }
            zzbg zzbgVar = zzadVar.b1;
            if (zzbgVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.f, zzbgVar.X);
                zzbb zzbbVar = zzbgVar.Y;
                if (zzbbVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.g, zzbbVar.G0());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.e, zzadVar.c1);
            zzbg zzbgVar2 = zzadVar.d1;
            if (zzbgVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.h, zzbgVar2.X);
                zzbb zzbbVar2 = zzbgVar2.Y;
                if (zzbbVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.i, zzbbVar2.G0());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.f309o, zzadVar.Z.Z);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.j, zzadVar.e1);
            zzbg zzbgVar3 = zzadVar.f1;
            if (zzbgVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.k, zzbgVar3.X);
                zzbb zzbbVar3 = zzbgVar3.Y;
                if (zzbbVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.l, zzbbVar3.G0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean v0(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    public static Bundle[] x0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        } else {
            return null;
        }
    }

    public static long y(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    public static int y0() {
        if (Build.VERSION.SDK_INT >= 30 && R5.a(30) > 3) {
            return R5.a(1000000);
        }
        return 0;
    }

    public final Object A0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return H(O0(str), obj, true, false);
        }
        return H(O0(str), obj, false, false);
    }

    public final Bundle C(Uri uri, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                if (z2) {
                    str5 = uri.getQueryParameter("gbraid");
                } else {
                    str5 = null;
                }
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                if (z) {
                    str9 = uri.getQueryParameter("sfmc_id");
                } else {
                    str9 = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z2 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z || TextUtils.isEmpty(str9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z2 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(FirebaseAnalytics.Param.O, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.Q);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.Param.Q, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.R);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(FirebaseAnalytics.Param.R, queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString(FirebaseAnalytics.Param.S, str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.Param.T, queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString(FirebaseAnalytics.Param.U, queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString(FirebaseAnalytics.Param.V, queryParameter8);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (z && !TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            j().L().b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    public final boolean C0(String str, String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            j().H().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                j().H().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final Bundle E(String str, String str2, Bundle bundle, List<String> list, boolean z) {
        int i2;
        String str3;
        String str4;
        List<String> list2 = list;
        boolean m0 = m0(str2, zzii.d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int E = d().E();
        int i3 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 != null && list2.contains(str5)) {
                i2 = 0;
            } else {
                if (!z) {
                    i2 = N0(str5);
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i2 = M0(str5);
                }
            }
            if (i2 != 0) {
                if (i2 == 3) {
                    str4 = str5;
                } else {
                    str4 = null;
                }
                K(bundle2, i2, str5, str5, str4);
                bundle2.remove(str5);
            } else {
                int x = x(str, str2, str5, bundle.get(str5), bundle2, list2, z, m0);
                if (x == 17) {
                    K(bundle2, x, str5, str5, Boolean.FALSE);
                } else if (x != 0 && !"_ev".equals(str5)) {
                    if (x == 21) {
                        str3 = str2;
                    } else {
                        str3 = str5;
                    }
                    K(bundle2, x, str3, str5, bundle.get(str5));
                    bundle2.remove(str5);
                }
                if (J0(str5) && (i3 = i3 + 1) > E) {
                    j().H().c("Event can't contain more than " + E + " params", g().c(str2), g().a(bundle));
                    v0(bundle2, 5);
                    bundle2.remove(str5);
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    @InterfaceC10697xN2
    public final boolean E0(String str) {
        n();
        if (Wrappers.a(a()).a(str) == 0) {
            return true;
        }
        j().F().b("Permission not granted", str);
        return false;
    }

    public final boolean F0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return d().N().equals(str);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.gms.measurement.internal.zzbb, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.gms.measurement.internal.zzfq, java.lang.String] */
    public final zzbg G(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString(CrashlyticsAnalyticsListener.c, str3);
            Bundle E = E(str, str2, bundle2, CollectionUtils.c(CrashlyticsAnalyticsListener.c), true);
            if (z) {
                E = r0(E);
            }
            Preconditions.r(E);
            ?? zzbbVar = new zzbb(E);
            return new zzbg(str2, zzbbVar, zzbbVar, j2);
        }
        zzft G = j().G();
        ?? g = g();
        G.b("Invalid conditional property event name", g.g(g));
        throw new IllegalArgumentException();
    }

    @InterfaceC8557od0({"this.apkVersion"})
    public final int G0() {
        if (this.h == null) {
            this.h = Integer.valueOf(GoogleApiAvailabilityLight.i().b(a()) / 1000);
        }
        return this.h.intValue();
    }

    public final Object H(int i2, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        Bundle r0;
        long j2;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return obj;
            }
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j2 = 1;
                } else {
                    j2 = 0;
                }
                return Long.valueOf(j2);
            } else if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            } else {
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if ((parcelable instanceof Bundle) && (r0 = r0((Bundle) parcelable)) != null && !r0.isEmpty()) {
                            arrayList.add(r0);
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return I(String.valueOf(obj), i2, z);
            }
        }
        return obj;
    }

    @InterfaceC10697xN2
    public final long I0() {
        long j2;
        n();
        if (!D0(this.a.B().F())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j2 = 4;
        } else if (R5.a(30) < 4) {
            j2 = 8;
        } else if (y0() < zzbi.X.a(null).intValue()) {
            j2 = 16;
        } else {
            j2 = 0;
        }
        if (!E0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0 && !X0()) {
            j2 |= 64;
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final URL J(long j2, String str, String str2, long j3, String str3) {
        try {
            Preconditions.l(str2);
            Preconditions.l(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j2), Integer.valueOf(G0())), str2, str, Long.valueOf(j3));
            if (str.equals(d().O())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e) {
            e = e;
            j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final boolean K0(String str) {
        List<ResolveInfo> queryIntentActivities;
        if (TextUtils.isEmpty(str) || (queryIntentActivities = a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    @InterfaceC10697xN2
    public final void L(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            j().L().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    i().N(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final int M0(String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (!n0("event param", null, str)) {
            return 14;
        }
        if (!i0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final void N(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                j().M().c("Not putting event parameter. Invalid value type. name, type", g().f(str), str2);
            }
        }
    }

    public final int N0(String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (!n0("event param", null, str)) {
            return 14;
        }
        if (!i0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final void O(com.google.android.gms.internal.measurement.zzcv zzcvVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zzcvVar.v0(bundle);
        } catch (RemoteException e) {
            this.a.j().L().b("Error returning int value to wrapper", e);
        }
    }

    public final void P(com.google.android.gms.internal.measurement.zzcv zzcvVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzcvVar.v0(bundle);
        } catch (RemoteException e) {
            this.a.j().L().b("Error returning long value to wrapper", e);
        }
    }

    public final long P0() {
        long andIncrement;
        long j2;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
                int i2 = this.e + 1;
                this.e = i2;
                j2 = nextLong + i2;
            }
            return j2;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1L, 1L);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    public final void Q(com.google.android.gms.internal.measurement.zzcv zzcvVar, Bundle bundle) {
        try {
            zzcvVar.v0(bundle);
        } catch (RemoteException e) {
            this.a.j().L().b("Error returning bundle value to wrapper", e);
        }
    }

    public final AbstractC10026ue1 Q0() {
        if (this.f == null) {
            this.f = AbstractC10026ue1.b(a());
        }
        return this.f;
    }

    public final void R(com.google.android.gms.internal.measurement.zzcv zzcvVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcvVar.v0(bundle);
        } catch (RemoteException e) {
            this.a.j().L().b("Error returning string value to wrapper", e);
        }
    }

    public final void S(com.google.android.gms.internal.measurement.zzcv zzcvVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcvVar.v0(bundle);
        } catch (RemoteException e) {
            this.a.j().L().b("Error returning bundle list to wrapper", e);
        }
    }

    public final String S0() {
        byte[] bArr = new byte[16];
        U0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void T(com.google.android.gms.internal.measurement.zzcv zzcvVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcvVar.v0(bundle);
        } catch (RemoteException e) {
            this.a.j().L().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void U(com.google.android.gms.internal.measurement.zzcv zzcvVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcvVar.v0(bundle);
        } catch (RemoteException e) {
            this.a.j().L().b("Error returning byte array to wrapper", e);
        }
    }

    @InterfaceC8557od0({"this.secureRandom"})
    @InterfaceC10697xN2
    public final SecureRandom U0() {
        n();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final void V(zzfv zzfvVar, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(zzfvVar.d.keySet())) {
            if (J0(str) && (i3 = i3 + 1) > i2) {
                j().H().c("Event can't contain more than " + i2 + " params", g().c(zzfvVar.a), g().a(zzfvVar.d));
                v0(zzfvVar.d, 5);
                zzfvVar.d.remove(str);
            }
        }
    }

    @InterfaceC10697xN2
    public final boolean V0() {
        n();
        if (I0() == 1) {
            return true;
        }
        return false;
    }

    public final boolean W0() {
        try {
            a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void Z(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i2;
        int x;
        String str4;
        List<String> list2 = list;
        if (bundle != null) {
            int v = d().v();
            int i3 = 0;
            for (String str5 : new TreeSet(bundle.keySet())) {
                if (list2 != null && list2.contains(str5)) {
                    i2 = 0;
                } else {
                    if (!z) {
                        i2 = N0(str5);
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i2 = M0(str5);
                    }
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str4 = str5;
                    } else {
                        str4 = null;
                    }
                    K(bundle, i2, str5, str5, str4);
                    bundle.remove(str5);
                } else {
                    if (g0(bundle.get(str5))) {
                        j().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                        x = 22;
                    } else {
                        x = x(str, str2, str5, bundle.get(str5), bundle, list2, z, false);
                    }
                    if (x != 0 && !"_ev".equals(str5)) {
                        K(bundle, x, str5, str5, bundle.get(str5));
                        bundle.remove(str5);
                    } else if (J0(str5) && !m0(str5, zzik.d)) {
                        i3++;
                        if (!b0(231100000, true)) {
                            j().H().c("Item array not supported on client's version of Google Play Services (Android Only)", g().c(str2), g().a(bundle));
                            v0(bundle, 23);
                            bundle.remove(str5);
                        } else if (i3 > v) {
                            if (zzot.a() && d().s(zzbi.I0)) {
                                j().H().c("Item can't contain more than " + v + " item-scoped custom params", g().c(str2), g().a(bundle));
                                v0(bundle, 28);
                                bundle.remove(str5);
                            } else {
                                j().H().c("Item cannot contain custom parameters", g().c(str2), g().a(bundle));
                                v0(bundle, 23);
                                bundle.remove(str5);
                            }
                        }
                    }
                }
                list2 = list;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(Parcelable[] parcelableArr, int i2, boolean z) {
        Preconditions.r(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (J0(str) && !m0(str, zzik.d) && (i3 = i3 + 1) > i2) {
                    if (z) {
                        j().H().c("Param can't contain more than " + i2 + " item-scoped custom parameters", g().f(str), g().a(bundle));
                        v0(bundle, 28);
                    } else {
                        j().H().c("Param cannot contain item-scoped custom parameters", g().f(str), g().a(bundle));
                        v0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final boolean b0(int i2, boolean z) {
        Boolean X = this.a.J().X();
        if (G0() < i2 / 1000) {
            if (X == null || X.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    @SuppressLint({"ApplySharedPref"})
    public final boolean h0(String str, double d) {
        try {
            SharedPreferences.Editor edit = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString(C9998uW1.o0, str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (RuntimeException e) {
            j().G().b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    public final boolean i0(String str, int i2, String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i2) {
            j().H().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        } else {
            return true;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    public final boolean j0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!R0(str)) {
                if (this.a.r()) {
                    j().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzfr.v(str));
                }
                return false;
            }
            return true;
        } else if (!TextUtils.isEmpty(str2)) {
            if (!R0(str2)) {
                j().H().b("Invalid admob_app_id. Analytics disabled.", zzfr.v(str2));
                return false;
            }
            return true;
        } else {
            if (this.a.r()) {
                j().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final boolean k0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                j().M().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final boolean n0(String str, String[] strArr, String str2) {
        return o0(str, strArr, null, str2);
    }

    public final boolean o0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.r(str2);
        for (String str3 : i) {
            if (str2.startsWith(str3)) {
                j().H().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && m0(str2, strArr)) {
            if (strArr2 == null || !m0(str2, strArr2)) {
                j().H().c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    public final int q0(String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (!n0("user property", zzij.a, str)) {
            return 15;
        }
        if (!i0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    public final Bundle r0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object s0 = s0(str, bundle.get(str));
                if (s0 == null) {
                    j().M().b("Param value can't be null", g().f(str));
                } else {
                    N(bundle2, str, s0);
                }
            }
        }
        return bundle2;
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    public final boolean s() {
        return true;
    }

    public final Object s0(String str, Object obj) {
        int t;
        if ("_ev".equals(str)) {
            return H(d().w(this.a.B().F()), obj, true, true);
        }
        if (H0(str)) {
            t = d().w(this.a.B().F());
        } else {
            t = d().t(this.a.B().F());
        }
        return H(t, obj, false, true);
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    @InterfaceC10697xN2
    public final void t() {
        n();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                j().L().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    public final int u(int i2) {
        return GoogleApiAvailabilityLight.i().k(a(), GooglePlayServicesUtilLight.a);
    }

    @InterfaceC5056aJ2
    public final boolean u0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f = Wrappers.a(context).f(str, 64);
            if (f != null && (signatureArr = f.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            j().G().b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            j().G().b("Error obtaining certificate", e2);
            return true;
        }
    }

    public final int v(String str) {
        if (!w0("event", str)) {
            return 2;
        }
        if (!o0("event", zzii.a, zzii.b, str)) {
            return 13;
        }
        if (!i0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    public final int w(String str, Object obj) {
        boolean k0;
        if ("_ldl".equals(str)) {
            k0 = k0("user property referrer", str, O0(str), obj);
        } else {
            k0 = k0("user property", str, O0(str), obj);
        }
        if (k0) {
            return 0;
        }
        return 7;
    }

    public final boolean w0(String str, String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            j().H().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                j().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x(String str, String str2, String str3, Object obj, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int i2;
        int w;
        Object obj2;
        Parcelable[] parcelableArr;
        int size;
        n();
        int i3 = 0;
        if (g0(obj)) {
            if (z2) {
                if (!m0(str3, zzik.c)) {
                    return 20;
                }
                if (!this.a.J().e0()) {
                    return 25;
                }
                boolean z3 = obj instanceof Parcelable[];
                if (z3) {
                    size = ((Parcelable[]) obj).length;
                } else if (obj instanceof ArrayList) {
                    size = ((ArrayList) obj).size();
                }
                if (size > 200) {
                    j().M().d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                    if (z3) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        if (parcelableArr2.length > 200) {
                            bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr2, 200));
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        if (arrayList.size() > 200) {
                            bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                        }
                    }
                    i2 = 17;
                    if (H0(str2) && !H0(str3)) {
                        w = d().t(this.a.B().F());
                    } else {
                        w = d().w(this.a.B().F());
                    }
                    if (!k0("param", str3, w, obj)) {
                        return i2;
                    }
                    if (z2) {
                        if (obj instanceof Bundle) {
                            Z(str, str2, str3, (Bundle) obj, list, z);
                            return i2;
                        } else if (obj instanceof Parcelable[]) {
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (!(parcelable instanceof Bundle)) {
                                    j().M().c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                                    return 4;
                                }
                                Z(str, str2, str3, (Bundle) parcelable, list, z);
                            }
                            return i2;
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList2 = (ArrayList) obj;
                            int size2 = arrayList2.size();
                            while (i3 < size2) {
                                Object obj3 = arrayList2.get(i3);
                                int i4 = i3 + 1;
                                if (!(obj3 instanceof Bundle)) {
                                    zzft M = j().M();
                                    if (obj3 != null) {
                                        obj2 = obj3.getClass();
                                    } else {
                                        obj2 = "null";
                                    }
                                    M.c("All ArrayList elements must be of type Bundle. Value type, name", obj2, str3);
                                    return 4;
                                }
                                Z(str, str2, str3, (Bundle) obj3, list, z);
                                i3 = i4;
                            }
                            return i2;
                        } else {
                            return 4;
                        }
                    }
                    return 4;
                }
            } else {
                return 21;
            }
        }
        i2 = 0;
        if (H0(str2)) {
        }
        w = d().w(this.a.B().F());
        if (!k0("param", str3, w, obj)) {
        }
    }

    @InterfaceC10697xN2
    public final long z(Context context, String str) {
        n();
        Preconditions.r(context);
        Preconditions.l(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest T0 = T0();
        if (T0 == null) {
            j().G().a("Could not get MD5 instance");
            return -1L;
        } else if (packageManager != null) {
            try {
                if (!u0(context, str)) {
                    Signature[] signatureArr = Wrappers.a(context).f(a().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return B(T0.digest(signatureArr[0].toByteArray()));
                    }
                    j().L().a("Could not get signatures");
                    return -1L;
                }
                return 0L;
            } catch (PackageManager.NameNotFoundException e) {
                j().G().b("Package name not found", e);
                return 0L;
            }
        } else {
            return 0L;
        }
    }

    @InterfaceC10697xN2
    public final long z0(String str) {
        if (a().getPackageManager() == null) {
            return 0L;
        }
        int i2 = 0;
        try {
            ApplicationInfo c = Wrappers.a(a()).c(str, 0);
            if (c != null) {
                i2 = c.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            j().J().b("PackageManager failed to find running app: app_id", str);
        }
        return i2;
    }
}
