package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class RemoteCreator<T> {
    public final String a;
    public Object b;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@InterfaceC5670cr1 String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    public RemoteCreator(@InterfaceC5670cr1 String str) {
        this.a = str;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public abstract T a(@InterfaceC5670cr1 IBinder iBinder);

    @InterfaceC5670cr1
    @KeepForSdk
    public final T b(@InterfaceC5670cr1 Context context) throws RemoteCreatorException {
        if (this.b == null) {
            Preconditions.r(context);
            Context i = GooglePlayServicesUtilLight.i(context);
            if (i != null) {
                try {
                    this.b = a((IBinder) i.getClassLoader().loadClass(this.a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (IllegalAccessException e2) {
                    throw new RemoteCreatorException("Could not access creator.", e2);
                } catch (InstantiationException e3) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return (T) this.b;
    }
}
