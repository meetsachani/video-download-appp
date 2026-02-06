package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.C2311a;
import com.facebook.appevents.C2315e;
import com.facebook.internal.l0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import o.C5370bd;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.appevents.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2317g {
    @NotNull
    public static final C2317g a = new C2317g();
    public static final String b = C2317g.class.getName();
    @NotNull
    public static final String c = "AppEventsLogger.persistedevents";

    /* renamed from: com.facebook.appevents.g$a */
    /* loaded from: classes2.dex */
    public static final class a extends ObjectInputStream {
        @NotNull
        public static final C0071a X = new C0071a(null);
        @NotNull
        public static final String Y = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        @NotNull
        public static final String Z = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";

        /* renamed from: com.facebook.appevents.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0071a {
            public /* synthetic */ C0071a(C9516sY c9516sY) {
                this();
            }

            public C0071a() {
            }
        }

        public a(@Nullable InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        @NotNull
        public ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (C6562gT0.g(readClassDescriptor.getName(), Y)) {
                readClassDescriptor = ObjectStreamClass.lookup(C2311a.b.class);
            } else if (C6562gT0.g(readClassDescriptor.getName(), Z)) {
                readClassDescriptor = ObjectStreamClass.lookup(C2315e.b.class);
            }
            C6562gT0.o(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x0003, B:10:0x002c, B:11:0x0031, B:48:0x00ac, B:16:0x003f, B:36:0x007d, B:37:0x0082, B:41:0x0094, B:40:0x008d, B:30:0x0065, B:31:0x006a, B:34:0x0075, B:35:0x0079, B:42:0x0095, B:43:0x009a, B:46:0x00a5), top: B:59:0x0003, inners: #0, #1, #8, #9 }] */
    @InterfaceC9511sW0
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized L a() {
        L l;
        Throwable th;
        a aVar;
        String str;
        String str2;
        Object readObject;
        synchronized (C2317g.class) {
            C5370bd c5370bd = C5370bd.a;
            C5370bd.b();
            com.facebook.M m = com.facebook.M.a;
            Context n = com.facebook.M.n();
            l = null;
            try {
                try {
                    FileInputStream openFileInput = n.openFileInput(c);
                    C6562gT0.o(openFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    aVar = new a(new BufferedInputStream(openFileInput));
                } catch (FileNotFoundException unused) {
                    aVar = null;
                } catch (Exception e) {
                    e = e;
                    aVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    l0 l0Var = l0.a;
                    l0.j(null);
                    try {
                        n.getFileStreamPath(c).delete();
                    } catch (Exception e2) {
                        Log.w(b, "Got unexpected exception when removing events file: ", e2);
                    }
                    throw th;
                }
                try {
                    readObject = aVar.readObject();
                } catch (FileNotFoundException unused2) {
                    l0 l0Var2 = l0.a;
                    l0.j(aVar);
                    try {
                        n.getFileStreamPath(c).delete();
                    } catch (Exception e3) {
                        e = e3;
                        str = b;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                        if (l == null) {
                        }
                        return l;
                    }
                    if (l == null) {
                    }
                    return l;
                } catch (Exception e4) {
                    e = e4;
                    Log.w(b, "Got unexpected exception while reading events: ", e);
                    l0 l0Var3 = l0.a;
                    l0.j(aVar);
                    try {
                        n.getFileStreamPath(c).delete();
                    } catch (Exception e5) {
                        e = e5;
                        str = b;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                        if (l == null) {
                        }
                        return l;
                    }
                    if (l == null) {
                    }
                    return l;
                }
                if (readObject != null) {
                    L l2 = (L) readObject;
                    l0 l0Var4 = l0.a;
                    l0.j(aVar);
                    try {
                        n.getFileStreamPath(c).delete();
                    } catch (Exception e6) {
                        Log.w(b, "Got unexpected exception when removing events file: ", e6);
                    }
                    l = l2;
                    if (l == null) {
                        l = new L();
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                }
            } catch (Throwable th3) {
                th = th3;
                l0 l0Var5 = l0.a;
                l0.j(null);
                n.getFileStreamPath(c).delete();
                throw th;
            }
        }
        return l;
    }

    @InterfaceC9511sW0
    public static final void b(@Nullable L l) {
        ObjectOutputStream objectOutputStream;
        com.facebook.M m = com.facebook.M.a;
        Context n = com.facebook.M.n();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(n.openFileOutput(c, 0)));
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(l);
            l0 l0Var = l0.a;
            l0.j(objectOutputStream);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            try {
                Log.w(b, "Got unexpected exception while persisting events: ", th);
                try {
                    n.getFileStreamPath(c).delete();
                } catch (Exception unused) {
                }
            } finally {
                l0 l0Var2 = l0.a;
                l0.j(objectOutputStream2);
            }
        }
    }
}
