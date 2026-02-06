package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface IObjectWrapper extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @InterfaceC5670cr1
        public static IObjectWrapper g1(@InterfaceC5670cr1 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof IObjectWrapper) {
                return (IObjectWrapper) queryLocalInterface;
            }
            return new zzb(iBinder);
        }
    }
}
