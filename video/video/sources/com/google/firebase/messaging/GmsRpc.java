package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import o.D6;
import o.InterfaceC10251va;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class GmsRpc {
    public static final String A = "gmp_app_id";
    public static final String B = "gmsv";
    public static final String C = "osv";
    public static final String D = "app_ver";
    public static final String E = "app_ver_name";
    public static final String F = "Goog-Firebase-Installations-Auth";
    public static final String G = "firebase-app-name-hash";
    public static final String H = "RST_FULL";
    public static final String I = "RST";
    public static final String J = "SYNC";
    public static final String K = "*";
    public static final String g = "FirebaseMessaging";
    public static final String h = "registration_id";
    public static final String i = "unregistered";
    public static final String j = "error";
    public static final String k = "SERVICE_NOT_AVAILABLE";
    public static final String l = "INTERNAL_SERVER_ERROR";
    public static final String m = "fire-iid";
    public static final String n = "InternalServerError";

    /* renamed from: o  reason: collision with root package name */
    public static final String f372o = "gcm.topic";
    public static final String p = "/topics/";
    public static final String q = "INSTANCE_ID_RESET";
    public static final String r = "subtype";
    public static final String s = "sender";
    public static final String t = "scope";
    public static final String u = "delete";
    public static final String v = "iid-operation";
    public static final String w = "appid";
    public static final String x = "Firebase-Client";
    public static final String y = "Firebase-Client-Log-Type";
    public static final String z = "cliv";
    public final FirebaseApp a;
    public final Metadata b;
    public final Rpc c;
    public final Provider<UserAgentPublisher> d;
    public final Provider<HeartBeatInfo> e;
    public final FirebaseInstallationsApi f;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new Rpc(firebaseApp.n()), provider, provider2, firebaseInstallationsApi);
    }

    public static /* synthetic */ String a(GmsRpc gmsRpc, Task task) {
        gmsRpc.getClass();
        return gmsRpc.g((Bundle) task.s(IOException.class));
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean h(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !n.equals(str)) {
            return false;
        }
        return true;
    }

    public Task<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString(u, "1");
        return d(j(Metadata.c(this.a), "*", bundle));
    }

    public final Task<String> d(Task<Bundle> task) {
        return task.n(new D6(), new Continuation() { // from class: com.google.firebase.messaging.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task2) {
                return GmsRpc.a(GmsRpc.this, task2);
            }
        });
    }

    public final String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.a.r().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public Task<String> f() {
        return d(j(Metadata.c(this.a), "*", new Bundle()));
    }

    @InterfaceC10251va
    public final String g(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString(h);
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString(i);
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!I.equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException(q);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        HeartBeatInfo heartBeatInfo;
        HeartBeatInfo.HeartBeat b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString(r, str);
        bundle.putString(A, this.a.s().j());
        bundle.putString(B, Integer.toString(this.b.d()));
        bundle.putString(C, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(D, this.b.a());
        bundle.putString(E, this.b.b());
        bundle.putString(G, e());
        try {
            String b2 = ((InstallationTokenResult) Tasks.a(this.f.c(false))).b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString(F, b2);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(w, (String) Tasks.a(this.f.getId()));
            bundle.putString(z, "fcm-" + BuildConfig.d);
            heartBeatInfo = this.e.get();
            UserAgentPublisher userAgentPublisher = this.d.get();
            if (heartBeatInfo != null) {
                return;
            }
            return;
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(w, (String) Tasks.a(this.f.getId()));
            bundle.putString(z, "fcm-" + BuildConfig.d);
            heartBeatInfo = this.e.get();
            UserAgentPublisher userAgentPublisher2 = this.d.get();
            if (heartBeatInfo != null) {
            }
        }
        bundle.putString(w, (String) Tasks.a(this.f.getId()));
        bundle.putString(z, "fcm-" + BuildConfig.d);
        heartBeatInfo = this.e.get();
        UserAgentPublisher userAgentPublisher22 = this.d.get();
        if (heartBeatInfo != null && userAgentPublisher22 != null && (b = heartBeatInfo.b(m)) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString(y, Integer.toString(b.e()));
            bundle.putString(x, userAgentPublisher22.a());
        }
    }

    public final Task<Bundle> j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.f(e);
        }
    }

    public Task<?> k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f372o, "/topics/" + str2);
        return d(j(str, "/topics/" + str2, bundle));
    }

    public Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f372o, "/topics/" + str2);
        bundle.putString(u, "1");
        return d(j(str, "/topics/" + str2, bundle));
    }

    @InterfaceC5056aJ2
    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Rpc rpc, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.a = firebaseApp;
        this.b = metadata;
        this.c = rpc;
        this.d = provider;
        this.e = provider2;
        this.f = firebaseInstallationsApi;
    }
}
