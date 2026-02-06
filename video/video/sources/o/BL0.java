package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface BL0 extends IInterface {
    void j7(byte[] response) throws RemoteException;

    void q0(String error) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements BL0 {
        public static final String X = "androidx.work.multiprocess.IWorkManagerImplCallback";
        public static final int Y = 1;
        public static final int Z = 2;

        /* loaded from: classes.dex */
        public static class a implements BL0 {
            public static BL0 Y;
            public IBinder X;

            public a(IBinder remote) {
                this.X = remote;
            }

            public String O0() {
                return b.X;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // o.BL0
            public void j7(byte[] response) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeByteArray(response);
                    if (!this.X.transact(1, obtain, null, 1) && b.g1() != null) {
                        b.g1().j7(response);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o.BL0
            public void q0(String error) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeString(error);
                    if (!this.X.transact(2, obtain, null, 1) && b.g1() != null) {
                        b.g1().q0(error);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, X);
        }

        public static BL0 O0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof BL0)) {
                return (BL0) queryLocalInterface;
            }
            return new a(obj);
        }

        public static BL0 g1() {
            return a.Y;
        }

        public static boolean o1(BL0 impl) {
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
            if (code != 1) {
                if (code != 2) {
                    if (code != 1598968902) {
                        return super.onTransact(code, data, reply, flags);
                    }
                    reply.writeString(X);
                    return true;
                }
                data.enforceInterface(X);
                q0(data.readString());
                return true;
            }
            data.enforceInterface(X);
            j7(data.createByteArray());
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements BL0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.BL0
        public void j7(byte[] response) throws RemoteException {
        }

        @Override // o.BL0
        public void q0(String error) throws RemoteException {
        }
    }
}
