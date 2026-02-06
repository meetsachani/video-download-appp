package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o.BL0;

/* renamed from: o.dJ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5782dJ0 extends IInterface {
    void L4(byte[] request, BL0 callback) throws RemoteException;

    void b4(byte[] request, BL0 callback) throws RemoteException;

    /* renamed from: o.dJ0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC5782dJ0 {
        public static final String X = "androidx.work.multiprocess.IListenableWorkerImpl";
        public static final int Y = 1;
        public static final int Z = 2;

        /* renamed from: o.dJ0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC5782dJ0 {
            public static InterfaceC5782dJ0 Y;
            public IBinder X;

            public a(IBinder remote) {
                this.X = remote;
            }

            @Override // o.InterfaceC5782dJ0
            public void L4(byte[] request, BL0 callback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeByteArray(request);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.X.transact(2, obtain, null, 1) && b.g1() != null) {
                        b.g1().L4(request, callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
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

            @Override // o.InterfaceC5782dJ0
            public void b4(byte[] request, BL0 callback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeByteArray(request);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.X.transact(1, obtain, null, 1) && b.g1() != null) {
                        b.g1().b4(request, callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public b() {
            attachInterface(this, X);
        }

        public static InterfaceC5782dJ0 O0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC5782dJ0)) {
                return (InterfaceC5782dJ0) queryLocalInterface;
            }
            return new a(obj);
        }

        public static InterfaceC5782dJ0 g1() {
            return a.Y;
        }

        public static boolean o1(InterfaceC5782dJ0 impl) {
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
                L4(data.createByteArray(), BL0.b.O0(data.readStrongBinder()));
                return true;
            }
            data.enforceInterface(X);
            b4(data.createByteArray(), BL0.b.O0(data.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.dJ0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC5782dJ0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC5782dJ0
        public void L4(byte[] request, BL0 callback) throws RemoteException {
        }

        @Override // o.InterfaceC5782dJ0
        public void b4(byte[] request, BL0 callback) throws RemoteException {
        }
    }
}
