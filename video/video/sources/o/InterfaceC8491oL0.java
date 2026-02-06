package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o.oL0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC8491oL0 extends IInterface {

    /* renamed from: o.oL0$a */
    /* loaded from: classes2.dex */
    public static class a implements InterfaceC8491oL0 {
        @Override // o.InterfaceC8491oL0
        public int L1(Bundle eventsBundle) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    int L1(Bundle eventsBundle) throws RemoteException;

    /* renamed from: o.oL0$b */
    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements InterfaceC8491oL0 {
        public static final String X = "com.facebook.ppml.receiver.IReceiverService";
        public static final int Y = 1;

        /* renamed from: o.oL0$b$a */
        /* loaded from: classes2.dex */
        public static class a implements InterfaceC8491oL0 {
            public static InterfaceC8491oL0 Y;
            public IBinder X;

            public a(IBinder remote) {
                this.X = remote;
            }

            @Override // o.InterfaceC8491oL0
            public int L1(Bundle eventsBundle) throws RemoteException {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (eventsBundle != null) {
                        obtain.writeInt(1);
                        eventsBundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(1, obtain, obtain2, 0) && b.g1() != null) {
                        readInt = b.g1().L1(eventsBundle);
                    } else {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String O0() {
                return b.X;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }
        }

        public b() {
            attachInterface(this, X);
        }

        public static InterfaceC8491oL0 O0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8491oL0)) {
                return (InterfaceC8491oL0) queryLocalInterface;
            }
            return new a(obj);
        }

        public static InterfaceC8491oL0 g1() {
            return a.Y;
        }

        public static boolean o1(InterfaceC8491oL0 impl) {
            if (a.Y == null) {
                if (impl != null) {
                    a.Y = impl;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            Bundle bundle;
            if (code != 1) {
                if (code != 1598968902) {
                    return super.onTransact(code, data, reply, flags);
                }
                reply.writeString(X);
                return true;
            }
            data.enforceInterface(X);
            if (data.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(data);
            } else {
                bundle = null;
            }
            int L1 = L1(bundle);
            reply.writeNoException();
            reply.writeInt(L1);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
