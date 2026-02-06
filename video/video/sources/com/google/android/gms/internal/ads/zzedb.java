package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
import o.AbstractC10026ue1;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzedb {
    @InterfaceC11300zs1
    public AbstractC10026ue1 a;
    public final Context b;

    public zzedb(Context context) {
        this.b = context;
    }

    public final InterfaceFutureC8411o11 a() {
        try {
            AbstractC10026ue1 b = AbstractC10026ue1.b(this.b);
            this.a = b;
            if (b == null) {
                return zzgcy.g(new IllegalStateException("MeasurementManagerFutures is null"));
            }
            return b.c();
        } catch (Exception e) {
            return zzgcy.g(e);
        }
    }

    public final InterfaceFutureC8411o11 b(Uri uri, InputEvent inputEvent) {
        try {
            AbstractC10026ue1 abstractC10026ue1 = this.a;
            Objects.requireNonNull(abstractC10026ue1);
            return abstractC10026ue1.d(uri, inputEvent);
        } catch (Exception e) {
            return zzgcy.g(e);
        }
    }
}
