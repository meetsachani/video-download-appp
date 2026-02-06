package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.a;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {
        public static final String X = "androidx.room.IMultiInstanceInvalidationService";
        public static final int Y = 1;
        public static final int Y0 = 3;
        public static final int Z = 2;

        /* renamed from: androidx.room.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0047a implements b {
            public IBinder X;

            public C0047a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // androidx.room.b
            public int D5(androidx.room.a aVar, String str) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.X);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.X.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.room.b
            public void M7(androidx.room.a aVar, int i) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.X);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.X.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String O0() {
                return a.X;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // androidx.room.b
            public void n4(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.X);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.X.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, X);
        }

        public static b O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0047a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 1598968902) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        parcel2.writeString(X);
                        return true;
                    }
                    parcel.enforceInterface(X);
                    n4(parcel.readInt(), parcel.createStringArray());
                    return true;
                }
                parcel.enforceInterface(X);
                M7(a.AbstractBinderC0045a.O0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(X);
            int D5 = D5(a.AbstractBinderC0045a.O0(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(D5);
            return true;
        }
    }

    int D5(androidx.room.a aVar, String str) throws RemoteException;

    void M7(androidx.room.a aVar, int i) throws RemoteException;

    void n4(int i, String[] strArr) throws RemoteException;
}
