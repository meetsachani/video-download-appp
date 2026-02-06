package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

/* loaded from: classes3.dex */
final class zza extends AsyncTask {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProviderInstaller.ProviderInstallListener b;

    public zza(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.a = context;
        this.b = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            ProviderInstaller.a(this.a);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return Integer.valueOf(e.X);
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.b());
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.b.a();
            return;
        }
        Context context = this.a;
        googleApiAvailabilityLight = ProviderInstaller.b;
        this.b.b(num.intValue(), googleApiAvailabilityLight.e(context, num.intValue(), "pi"));
    }
}
