package o;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: o.eJ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6024eJ0 extends IInterface {
    public static final String N = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: o.eJ0$c */
    /* loaded from: classes.dex */
    public static class c {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void D7(String str, int i, String str2, Notification notification) throws RemoteException;

    void m3(String str, int i, String str2) throws RemoteException;

    void y5(String str) throws RemoteException;

    /* renamed from: o.eJ0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements InterfaceC6024eJ0 {
        public static final int X = 1;
        public static final int Y = 2;
        public static final int Z = 3;

        /* renamed from: o.eJ0$b$a */
        /* loaded from: classes.dex */
        public static class a implements InterfaceC6024eJ0 {
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // o.InterfaceC6024eJ0
            public void D7(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC6024eJ0.N);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    c.d(obtain, notification, 0);
                    this.X.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String O0() {
                return InterfaceC6024eJ0.N;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // o.InterfaceC6024eJ0
            public void m3(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC6024eJ0.N);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.X.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC6024eJ0
            public void y5(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC6024eJ0.N);
                    obtain.writeString(str);
                    this.X.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, InterfaceC6024eJ0.N);
        }

        public static InterfaceC6024eJ0 O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC6024eJ0.N);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC6024eJ0)) {
                return (InterfaceC6024eJ0) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC6024eJ0.N;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    y5(parcel.readString());
                } else {
                    m3(parcel.readString(), parcel.readInt(), parcel.readString());
                }
            } else {
                D7(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) c.c(parcel, Notification.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: o.eJ0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6024eJ0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o.InterfaceC6024eJ0
        public void y5(String str) throws RemoteException {
        }

        @Override // o.InterfaceC6024eJ0
        public void m3(String str, int i, String str2) throws RemoteException {
        }

        @Override // o.InterfaceC6024eJ0
        public void D7(String str, int i, String str2, Notification notification) throws RemoteException {
        }
    }
}
