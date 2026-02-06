package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o.BL0;

/* loaded from: classes.dex */
public interface AL0 extends IInterface {
    void S5(byte[] request, BL0 callback) throws RemoteException;

    void X4(byte[] request, BL0 callback) throws RemoteException;

    void Y4(String id, BL0 callback) throws RemoteException;

    void a4(String name, BL0 callback) throws RemoteException;

    void d6(byte[] request, BL0 callback) throws RemoteException;

    void i2(BL0 callback) throws RemoteException;

    void o2(String tag, BL0 callback) throws RemoteException;

    void u2(byte[] request, BL0 callback) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements AL0 {
        public static final String X = "androidx.work.multiprocess.IWorkManagerImpl";
        public static final int Y = 1;
        public static final int Y0 = 3;
        public static final int Z = 2;
        public static final int Z0 = 4;
        public static final int a1 = 5;
        public static final int b1 = 6;
        public static final int c1 = 7;
        public static final int d1 = 8;

        /* loaded from: classes.dex */
        public static class a implements AL0 {
            public static AL0 Y;
            public IBinder X;

            public a(IBinder remote) {
                this.X = remote;
            }

            public String O0() {
                return b.X;
            }

            @Override // o.AL0
            public void S5(byte[] request, BL0 callback) throws RemoteException {
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
                    if (!this.X.transact(8, obtain, null, 1) && b.g1() != null) {
                        b.g1().S5(request, callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // o.AL0
            public void X4(byte[] request, BL0 callback) throws RemoteException {
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
                    if (!this.X.transact(7, obtain, null, 1) && b.g1() != null) {
                        b.g1().X4(request, callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // o.AL0
            public void Y4(String id, BL0 callback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeString(id);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.X.transact(3, obtain, null, 1) && b.g1() != null) {
                        b.g1().Y4(id, callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // o.AL0
            public void a4(String name, BL0 callback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeString(name);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.X.transact(5, obtain, null, 1) && b.g1() != null) {
                        b.g1().a4(name, callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // o.AL0
            public void d6(byte[] request, BL0 callback) throws RemoteException {
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
                        b.g1().d6(request, callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // o.AL0
            public void i2(BL0 callback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.X.transact(6, obtain, null, 1) && b.g1() != null) {
                        b.g1().i2(callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // o.AL0
            public void o2(String tag, BL0 callback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeString(tag);
                    if (callback != null) {
                        iBinder = callback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.X.transact(4, obtain, null, 1) && b.g1() != null) {
                        b.g1().o2(tag, callback);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // o.AL0
            public void u2(byte[] request, BL0 callback) throws RemoteException {
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
                        b.g1().u2(request, callback);
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

        public static AL0 O0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof AL0)) {
                return (AL0) queryLocalInterface;
            }
            return new a(obj);
        }

        public static AL0 g1() {
            return a.Y;
        }

        public static boolean o1(AL0 impl) {
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
            if (code != 1598968902) {
                switch (code) {
                    case 1:
                        data.enforceInterface(X);
                        u2(data.createByteArray(), BL0.b.O0(data.readStrongBinder()));
                        return true;
                    case 2:
                        data.enforceInterface(X);
                        d6(data.createByteArray(), BL0.b.O0(data.readStrongBinder()));
                        return true;
                    case 3:
                        data.enforceInterface(X);
                        Y4(data.readString(), BL0.b.O0(data.readStrongBinder()));
                        return true;
                    case 4:
                        data.enforceInterface(X);
                        o2(data.readString(), BL0.b.O0(data.readStrongBinder()));
                        return true;
                    case 5:
                        data.enforceInterface(X);
                        a4(data.readString(), BL0.b.O0(data.readStrongBinder()));
                        return true;
                    case 6:
                        data.enforceInterface(X);
                        i2(BL0.b.O0(data.readStrongBinder()));
                        return true;
                    case 7:
                        data.enforceInterface(X);
                        X4(data.createByteArray(), BL0.b.O0(data.readStrongBinder()));
                        return true;
                    case 8:
                        data.enforceInterface(X);
                        S5(data.createByteArray(), BL0.b.O0(data.readStrongBinder()));
                        return true;
                    default:
                        return super.onTransact(code, data, reply, flags);
                }
            }
            reply.writeString(X);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements AL0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.AL0
        public void i2(BL0 callback) throws RemoteException {
        }

        @Override // o.AL0
        public void S5(byte[] request, BL0 callback) throws RemoteException {
        }

        @Override // o.AL0
        public void X4(byte[] request, BL0 callback) throws RemoteException {
        }

        @Override // o.AL0
        public void Y4(String id, BL0 callback) throws RemoteException {
        }

        @Override // o.AL0
        public void a4(String name, BL0 callback) throws RemoteException {
        }

        @Override // o.AL0
        public void d6(byte[] request, BL0 callback) throws RemoteException {
        }

        @Override // o.AL0
        public void o2(String tag, BL0 callback) throws RemoteException {
        }

        @Override // o.AL0
        public void u2(byte[] request, BL0 callback) throws RemoteException {
        }
    }
}
