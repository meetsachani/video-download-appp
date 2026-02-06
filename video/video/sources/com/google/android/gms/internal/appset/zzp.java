package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes2.dex */
public final class zzp extends GoogleApi<Api.ApiOptions.NoOptions> implements AppSetIdClient {
    public static final Api.ClientKey<zzd> m;
    public static final Api.AbstractClientBuilder<zzd, Api.ApiOptions.NoOptions> n;

    /* renamed from: o  reason: collision with root package name */
    public static final Api<Api.ApiOptions.NoOptions> f302o;
    public final Context k;
    public final GoogleApiAvailabilityLight l;

    static {
        Api.ClientKey<zzd> clientKey = new Api.ClientKey<>();
        m = clientKey;
        zzn zznVar = new zzn();
        n = zznVar;
        f302o = new Api<>("AppSet.API", zznVar, clientKey);
    }

    public zzp(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, f302o, Api.ApiOptions.c, GoogleApi.Settings.c);
        this.k = context;
        this.l = googleApiAvailabilityLight;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> b() {
        if (this.l.k(this.k, 212800000) == 0) {
            return j(TaskApiCall.a().e(com.google.android.gms.appset.zze.a).c(new RemoteCall() { // from class: com.google.android.gms.internal.appset.zzm
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    ((zzg) ((zzd) obj).L()).o1(new com.google.android.gms.appset.zza(null, null), new zzo(zzp.this, (TaskCompletionSource) obj2));
                }
            }).d(false).f(27601).a());
        }
        return Tasks.f(new ApiException(new Status(17)));
    }
}
