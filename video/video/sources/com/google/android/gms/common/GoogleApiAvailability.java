package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import o.ActivityC4864Yy0;
import o.C10323vs;
import o.C2683Cr1;
import o.C2879Er1;
import o.C3086Gr1;
import o.C3771Nr1;
import o.C7715lE0;
import o.C7976mE0;
import o.InterfaceC10389w71;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    @InterfaceC5670cr1
    public static final String i = "com.google.android.gms";
    @InterfaceC8710pF0("mLock")
    public String g;
    public static final Object j = new Object();
    public static final GoogleApiAvailability k = new GoogleApiAvailability();
    public static final int h = GoogleApiAvailabilityLight.a;

    @InterfaceC5670cr1
    public static final Task<Map<ApiKey<?>, String>> M(@InterfaceC5670cr1 HasApiKey<?> hasApiKey, @InterfaceC5670cr1 HasApiKey<?>... hasApiKeyArr) {
        Preconditions.s(hasApiKey, "Requested API must not be null.");
        for (HasApiKey<?> hasApiKey2 : hasApiKeyArr) {
            Preconditions.s(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.y().B(arrayList);
    }

    @InterfaceC5670cr1
    public static GoogleApiAvailability x() {
        return k;
    }

    public boolean A(@InterfaceC5670cr1 Activity activity, int i2, int i3) {
        return B(activity, i2, i3, null);
    }

    public boolean B(@InterfaceC5670cr1 Activity activity, int i2, int i3, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        Dialog t = t(activity, i2, i3, onCancelListener);
        if (t == null) {
            return false;
        }
        H(activity, t, GooglePlayServicesUtil.k, onCancelListener);
        return true;
    }

    public void C(@InterfaceC5670cr1 Context context, int i2) {
        I(context, i2, null, g(context, i2, 0, GoogleApiAvailabilityLight.e));
    }

    public void D(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ConnectionResult connectionResult) {
        I(context, connectionResult.m0(), null, w(context, connectionResult));
    }

    @InterfaceC11300zs1
    public final Dialog E(@InterfaceC5670cr1 Context context, int i2, zag zagVar, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.d(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = com.google.android.gms.common.internal.zac.c(context, i2);
        if (c != null) {
            builder.setPositiveButton(c, zagVar);
        }
        String g = com.google.android.gms.common.internal.zac.g(context, i2);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i2)), new IllegalArgumentException());
        return builder.create();
    }

    @InterfaceC5670cr1
    public final Dialog F(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        H(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @InterfaceC11300zs1
    public final zabx G(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        context.registerReceiver(zabxVar, intentFilter);
        zabxVar.a(context);
        if (!n(context, "com.google.android.gms")) {
            zabwVar.a();
            zabxVar.b();
            return null;
        }
        return zabxVar;
    }

    public final void H(Activity activity, Dialog dialog, String str, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC4864Yy0) {
                SupportErrorDialogFragment.f3(dialog, onCancelListener).c3(((ActivityC4864Yy0) activity).W0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.b(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    public final void I(Context context, int i2, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 PendingIntent pendingIntent) {
        int i3;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i2), null), new IllegalArgumentException());
        if (i2 == 18) {
            J(context);
        } else if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String f = com.google.android.gms.common.internal.zac.f(context, i2);
            String e = com.google.android.gms.common.internal.zac.e(context, i2);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) Preconditions.r(context.getSystemService(MessagingAnalytics.b));
            C3771Nr1.n z0 = new C3771Nr1.n(context).e0(true).C(true).O(f).z0(new C3771Nr1.l().A(e));
            if (DeviceProperties.l(context)) {
                Preconditions.x(PlatformVersion.i());
                z0.t0(context.getApplicationInfo().icon).k0(2);
                if (DeviceProperties.m(context)) {
                    z0.a(com.google.android.gms.base.R.drawable.a, resources.getString(com.google.android.gms.base.R.string.f186o), pendingIntent);
                } else {
                    z0.M(pendingIntent);
                }
            } else {
                z0.t0(17301642).B0(resources.getString(com.google.android.gms.base.R.string.h)).H0(System.currentTimeMillis()).M(pendingIntent).N(e);
            }
            if (PlatformVersion.n()) {
                Preconditions.x(PlatformVersion.n());
                synchronized (j) {
                    str2 = this.g;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a = C2683Cr1.a(notificationManager, "com.google.android.gms.availability");
                    String b = com.google.android.gms.common.internal.zac.b(context);
                    if (a == null) {
                        C2879Er1.a(notificationManager, C3086Gr1.a("com.google.android.gms.availability", b, 4));
                    } else if (!b.contentEquals(C7715lE0.a(a))) {
                        C7976mE0.a(a, b);
                        C2879Er1.a(notificationManager, a);
                    }
                }
                z0.G(str2);
            }
            Notification h2 = z0.h();
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                i3 = GooglePlayServicesUtilLight.e;
            } else {
                GooglePlayServicesUtilLight.g.set(false);
                i3 = GooglePlayServicesUtilLight.f;
            }
            notificationManager.notify(i3, h2);
        }
    }

    public final void J(Context context) {
        new zac(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean K(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 LifecycleFragment lifecycleFragment, int i2, int i3, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        Dialog E = E(activity, i2, zag.d(lifecycleFragment, e(activity, i2, "d"), 2), onCancelListener);
        if (E == null) {
            return false;
        }
        H(activity, E, GooglePlayServicesUtil.k, onCancelListener);
        return true;
    }

    public final boolean L(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ConnectionResult connectionResult, int i2) {
        PendingIntent w;
        if (InstantApps.a(context) || (w = w(context, connectionResult)) == null) {
            return false;
        }
        I(context, connectionResult.m0(), null, zal.a(context, 0, GoogleApiActivity.a(context, w, i2, true), zal.a | C10323vs.Q0));
        return true;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int c(@InterfaceC5670cr1 Context context) {
        return super.c(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @InterfaceC11300zs1
    @ShowFirstParty
    @KeepForSdk
    public Intent e(@InterfaceC11300zs1 Context context, int i2, @InterfaceC11300zs1 String str) {
        return super.e(context, i2, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @InterfaceC11300zs1
    public PendingIntent f(@InterfaceC5670cr1 Context context, int i2, int i3) {
        return super.f(context, i2, i3);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @InterfaceC5670cr1
    public final String h(int i2) {
        return super.h(i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    public int j(@InterfaceC5670cr1 Context context) {
        return super.j(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int k(@InterfaceC5670cr1 Context context, int i2) {
        return super.k(context, i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean o(int i2) {
        return super.o(i2);
    }

    @InterfaceC5670cr1
    public Task<Void> q(@InterfaceC5670cr1 GoogleApi<?> googleApi, @InterfaceC5670cr1 GoogleApi<?>... googleApiArr) {
        return M(googleApi, googleApiArr).w(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                Map map = (Map) obj;
                int i2 = GoogleApiAvailability.h;
                return Tasks.g(null);
            }
        });
    }

    @InterfaceC5670cr1
    public Task<Void> r(@InterfaceC5670cr1 HasApiKey<?> hasApiKey, @InterfaceC5670cr1 HasApiKey<?>... hasApiKeyArr) {
        return M(hasApiKey, hasApiKeyArr).w(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                Map map = (Map) obj;
                int i2 = GoogleApiAvailability.h;
                return Tasks.g(null);
            }
        });
    }

    @InterfaceC11300zs1
    public Dialog s(@InterfaceC5670cr1 Activity activity, int i2, int i3) {
        return t(activity, i2, i3, null);
    }

    @InterfaceC11300zs1
    public Dialog t(@InterfaceC5670cr1 Activity activity, int i2, int i3, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        return E(activity, i2, zag.b(activity, e(activity, i2, "d"), i3), onCancelListener);
    }

    @InterfaceC11300zs1
    public Dialog u(@InterfaceC5670cr1 Fragment fragment, int i2, int i3) {
        return v(fragment, i2, i3, null);
    }

    @InterfaceC11300zs1
    public Dialog v(@InterfaceC5670cr1 Fragment fragment, int i2, int i3, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        return E(fragment.U1(), i2, zag.c(fragment, e(fragment.U1(), i2, "d"), i3), onCancelListener);
    }

    @InterfaceC11300zs1
    public PendingIntent w(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ConnectionResult connectionResult) {
        if (connectionResult.G0()) {
            return connectionResult.E0();
        }
        return f(context, connectionResult.m0(), 0);
    }

    @InterfaceC5670cr1
    @InterfaceC10389w71
    public Task<Void> y(@InterfaceC5670cr1 Activity activity) {
        int i2 = h;
        Preconditions.k("makeGooglePlayServicesAvailable must be called from the main thread");
        int k2 = k(activity, i2);
        if (k2 == 0) {
            return Tasks.g(null);
        }
        zacc u = zacc.u(activity);
        u.t(new ConnectionResult(k2, null), 0);
        return u.v();
    }

    @TargetApi(26)
    public void z(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        if (PlatformVersion.n()) {
            Preconditions.r(C2683Cr1.a((NotificationManager) Preconditions.r(context.getSystemService(MessagingAnalytics.b)), str));
        }
        synchronized (j) {
            this.g = str;
        }
    }
}
