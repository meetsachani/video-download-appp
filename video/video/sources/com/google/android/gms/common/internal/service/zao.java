package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zao extends GoogleApi<TelemetryLoggingOptions> implements TelemetryLoggingClient {
    public static final Api.ClientKey<zap> k;
    public static final Api.AbstractClientBuilder<zap, TelemetryLoggingOptions> l;
    public static final Api<TelemetryLoggingOptions> m;
    public static final /* synthetic */ int n = 0;

    static {
        Api.ClientKey<zap> clientKey = new Api.ClientKey<>();
        k = clientKey;
        zan zanVar = new zan();
        l = zanVar;
        m = new Api<>("ClientTelemetry.API", zanVar, clientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, m, telemetryLoggingOptions, GoogleApi.Settings.c);
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final Task<Void> a(final TelemetryData telemetryData) {
        TaskApiCall.Builder a = TaskApiCall.a();
        a.e(com.google.android.gms.internal.base.zad.a);
        a.d(false);
        a.c(new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i = zao.n;
                ((zai) ((zap) obj).L()).r4(telemetryData2);
                ((TaskCompletionSource) obj2).c(null);
            }
        });
        return h(a.a());
    }
}
