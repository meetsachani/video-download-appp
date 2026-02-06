package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class BlockingServiceConnection implements ServiceConnection {
    public boolean X = false;
    public final BlockingQueue Y = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public IBinder a() throws InterruptedException {
        Preconditions.q("BlockingServiceConnection.getService() called on main thread");
        if (!this.X) {
            this.X = true;
            return (IBinder) this.Y.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public IBinder b(long j, @InterfaceC5670cr1 TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.q("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.X) {
            this.X = true;
            IBinder iBinder = (IBinder) this.Y.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@InterfaceC5670cr1 ComponentName componentName, @InterfaceC5670cr1 IBinder iBinder) {
        this.Y.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@InterfaceC5670cr1 ComponentName componentName) {
    }
}
