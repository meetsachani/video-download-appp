package o;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Deprecated
/* renamed from: o.rt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9355rt {
    public static final String g = "cached_content_index.exi";
    public static final int h = 10485760;
    public final HashMap<String, C9106qt> a;
    public final SparseArray<String> b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public c e;
    @InterfaceC11300zs1
    public c f;

    /* renamed from: o.rt$a */
    /* loaded from: classes2.dex */
    public static final class a implements c {
        public static final String e = "ExoPlayerCacheIndex";
        public static final int f = 1;
        public static final String g = "id";
        public static final String h = "key";
        public static final String i = "metadata";
        public static final int j = 0;
        public static final int k = 1;
        public static final int l = 2;
        public static final String m = "id = ?";
        public static final String[] n = {"id", "key", "metadata"};

        /* renamed from: o  reason: collision with root package name */
        public static final String f855o = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        public final InterfaceC5100aV a;
        public final SparseArray<C9106qt> b = new SparseArray<>();
        public String c;
        public String d;

        public a(InterfaceC5100aV interfaceC5100aV) {
            this.a = interfaceC5100aV;
        }

        public static void j(InterfaceC5100aV interfaceC5100aV, long j2) throws YU {
            k(interfaceC5100aV, Long.toHexString(j2));
        }

        public static void k(InterfaceC5100aV interfaceC5100aV, String str) throws YU {
            try {
                String o2 = o(str);
                SQLiteDatabase writableDatabase = interfaceC5100aV.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                XE2.c(writableDatabase, 1, str);
                m(writableDatabase, o2);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new YU(e2);
            }
        }

        public static void m(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String o(String str) {
            return e + str;
        }

        @Override // o.C9355rt.c
        public void a() throws YU {
            k(this.a, (String) C9542sf.g(this.c));
        }

        @Override // o.C9355rt.c
        public void b(C9106qt c9106qt) {
            this.b.put(c9106qt.a, c9106qt);
        }

        @Override // o.C9355rt.c
        public boolean c() throws YU {
            try {
                if (XE2.b(this.a.getReadableDatabase(), 1, (String) C9542sf.g(this.c)) != -1) {
                    return true;
                }
                return false;
            } catch (SQLException e2) {
                throw new YU(e2);
            }
        }

        @Override // o.C9355rt.c
        public void d(HashMap<String, C9106qt> hashMap) throws IOException {
            if (this.b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    C9106qt valueAt = this.b.valueAt(i2);
                    if (valueAt == null) {
                        l(writableDatabase, this.b.keyAt(i2));
                    } else {
                        i(writableDatabase, valueAt);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new YU(e2);
            }
        }

        @Override // o.C9355rt.c
        public void e(long j2) {
            String hexString = Long.toHexString(j2);
            this.c = hexString;
            this.d = o(hexString);
        }

        @Override // o.C9355rt.c
        public void f(HashMap<String, C9106qt> hashMap) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                p(writableDatabase);
                for (C9106qt c9106qt : hashMap.values()) {
                    i(writableDatabase, c9106qt);
                }
                writableDatabase.setTransactionSuccessful();
                this.b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new YU(e2);
            }
        }

        @Override // o.C9355rt.c
        public void g(HashMap<String, C9106qt> hashMap, SparseArray<String> sparseArray) throws IOException {
            boolean z;
            if (this.b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            try {
                if (XE2.b(this.a.getReadableDatabase(), 1, (String) C9542sf.g(this.c)) != 1) {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    p(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                }
                Cursor n2 = n();
                while (n2.moveToNext()) {
                    C9106qt c9106qt = new C9106qt(n2.getInt(0), (String) C9542sf.g(n2.getString(1)), C9355rt.s(new DataInputStream(new ByteArrayInputStream(n2.getBlob(2)))));
                    hashMap.put(c9106qt.b, c9106qt);
                    sparseArray.put(c9106qt.a, c9106qt.b);
                }
                n2.close();
            } catch (SQLiteException e2) {
                hashMap.clear();
                sparseArray.clear();
                throw new YU(e2);
            }
        }

        @Override // o.C9355rt.c
        public void h(C9106qt c9106qt, boolean z) {
            if (z) {
                this.b.delete(c9106qt.a);
            } else {
                this.b.put(c9106qt.a, null);
            }
        }

        public final void i(SQLiteDatabase sQLiteDatabase, C9106qt c9106qt) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C9355rt.v(c9106qt.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(c9106qt.a));
            contentValues.put("key", c9106qt.b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) C9542sf.g(this.d), null, contentValues);
        }

        public final void l(SQLiteDatabase sQLiteDatabase, int i2) {
            sQLiteDatabase.delete((String) C9542sf.g(this.d), "id = ?", new String[]{Integer.toString(i2)});
        }

        public final Cursor n() {
            return this.a.getReadableDatabase().query((String) C9542sf.g(this.d), n, null, null, null, null, null);
        }

        public final void p(SQLiteDatabase sQLiteDatabase) throws YU {
            XE2.d(sQLiteDatabase, 1, (String) C9542sf.g(this.c), 1);
            m(sQLiteDatabase, (String) C9542sf.g(this.d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.d + C4500Ve2.b + f855o);
        }
    }

    /* renamed from: o.rt$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a() throws IOException;

        void b(C9106qt c9106qt);

        boolean c() throws IOException;

        void d(HashMap<String, C9106qt> hashMap) throws IOException;

        void e(long j);

        void f(HashMap<String, C9106qt> hashMap) throws IOException;

        void g(HashMap<String, C9106qt> hashMap, SparseArray<String> sparseArray) throws IOException;

        void h(C9106qt c9106qt, boolean z);
    }

    public C9355rt(InterfaceC5100aV interfaceC5100aV) {
        this(interfaceC5100aV, null, null, false, false);
    }

    public static /* synthetic */ Cipher a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return j();
    }

    @InterfaceC10697xN2
    public static void g(InterfaceC5100aV interfaceC5100aV, long j) throws YU {
        a.j(interfaceC5100aV, j);
    }

    @SuppressLint({"GetInstance"})
    public static Cipher j() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (TD2.a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    @InterfaceC5056aJ2
    public static int n(SparseArray<String> sparseArray) {
        int keyAt;
        int size = sparseArray.size();
        int i = 0;
        if (size == 0) {
            keyAt = 0;
        } else {
            keyAt = sparseArray.keyAt(size - 1) + 1;
        }
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            return i;
        }
        return keyAt;
    }

    public static boolean q(String str) {
        return str.startsWith(g);
    }

    public static C9759tY s(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, (int) h);
                byte[] bArr = TD2.f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, (int) h);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException("Invalid value size: " + readInt2);
            }
        }
        return new C9759tY(hashMap);
    }

    public static void v(C9759tY c9759tY, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> i = c9759tY.i();
        dataOutputStream.writeInt(i.size());
        for (Map.Entry<String, byte[]> entry : i) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final C9106qt d(String str) {
        int n = n(this.b);
        C9106qt c9106qt = new C9106qt(n, str);
        this.a.put(str, c9106qt);
        this.b.put(n, str);
        this.d.put(n, true);
        this.e.b(c9106qt);
        return c9106qt;
    }

    public void e(String str, C6533gM c6533gM) {
        C9106qt o2 = o(str);
        if (o2.b(c6533gM)) {
            this.e.b(o2);
        }
    }

    public int f(String str) {
        return o(str).a;
    }

    @InterfaceC11300zs1
    public C9106qt h(String str) {
        return this.a.get(str);
    }

    public Collection<C9106qt> i() {
        return Collections.unmodifiableCollection(this.a.values());
    }

    public InterfaceC6278fM k(String str) {
        C9106qt h2 = h(str);
        if (h2 != null) {
            return h2.d();
        }
        return C9759tY.f;
    }

    @InterfaceC11300zs1
    public String l(int i) {
        return this.b.get(i);
    }

    public Set<String> m() {
        return this.a.keySet();
    }

    public C9106qt o(String str) {
        C9106qt c9106qt = this.a.get(str);
        if (c9106qt == null) {
            return d(str);
        }
        return c9106qt;
    }

    @InterfaceC10697xN2
    public void p(long j) throws IOException {
        c cVar;
        this.e.e(j);
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.e(j);
        }
        if (!this.e.c() && (cVar = this.f) != null && cVar.c()) {
            this.f.g(this.a, this.b);
            this.e.f(this.a);
        } else {
            this.e.g(this.a, this.b);
        }
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.a();
            this.f = null;
        }
    }

    public void r(String str) {
        C9106qt c9106qt = this.a.get(str);
        if (c9106qt != null && c9106qt.g() && c9106qt.i()) {
            this.a.remove(str);
            int i = c9106qt.a;
            boolean z = this.d.get(i);
            this.e.h(c9106qt, z);
            if (z) {
                this.b.remove(i);
                this.d.delete(i);
                return;
            }
            this.b.put(i, null);
            this.c.put(i, true);
        }
    }

    public void t() {
        AbstractC6237fB2 it = AbstractC9481sO0.G(this.a.keySet()).iterator();
        while (it.hasNext()) {
            r((String) it.next());
        }
    }

    @InterfaceC10697xN2
    public void u() throws IOException {
        this.e.d(this.a);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }

    public C9355rt(@InterfaceC11300zs1 InterfaceC5100aV interfaceC5100aV, @InterfaceC11300zs1 File file, @InterfaceC11300zs1 byte[] bArr, boolean z, boolean z2) {
        C9542sf.i((interfaceC5100aV == null && file == null) ? false : true);
        this.a = new HashMap<>();
        this.b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        a aVar = interfaceC5100aV != null ? new a(interfaceC5100aV) : null;
        b bVar = file != null ? new b(new File(file, g), bArr, z) : null;
        if (aVar != null && (bVar == null || !z2)) {
            this.e = aVar;
            this.f = bVar;
            return;
        }
        this.e = (c) TD2.o(bVar);
        this.f = aVar;
    }

    /* renamed from: o.rt$b */
    /* loaded from: classes2.dex */
    public static class b implements c {
        public static final int h = 2;
        public static final int i = 2;
        public static final int j = 1;
        public final boolean a;
        @InterfaceC11300zs1
        public final Cipher b;
        @InterfaceC11300zs1
        public final SecretKeySpec c;
        @InterfaceC11300zs1
        public final SecureRandom d;
        public final C5624cg e;
        public boolean f;
        @InterfaceC11300zs1
        public C10724xU1 g;

        public b(File file, @InterfaceC11300zs1 byte[] bArr, boolean z) {
            boolean z2;
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            if (bArr == null && z) {
                z2 = false;
            } else {
                z2 = true;
            }
            C9542sf.i(z2);
            if (bArr != null) {
                C9542sf.a(bArr.length == 16);
                try {
                    cipher = C9355rt.a();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                C9542sf.a(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.a = z;
            this.b = cipher;
            this.c = secretKeySpec;
            this.d = z ? new SecureRandom() : null;
            this.e = new C5624cg(file);
        }

        @Override // o.C9355rt.c
        public void a() {
            this.e.a();
        }

        @Override // o.C9355rt.c
        public void b(C9106qt c9106qt) {
            this.f = true;
        }

        @Override // o.C9355rt.c
        public boolean c() {
            return this.e.c();
        }

        @Override // o.C9355rt.c
        public void d(HashMap<String, C9106qt> hashMap) throws IOException {
            if (!this.f) {
                return;
            }
            f(hashMap);
        }

        @Override // o.C9355rt.c
        public void f(HashMap<String, C9106qt> hashMap) throws IOException {
            m(hashMap);
            this.f = false;
        }

        @Override // o.C9355rt.c
        public void g(HashMap<String, C9106qt> hashMap, SparseArray<String> sparseArray) {
            C9542sf.i(!this.f);
            if (!k(hashMap, sparseArray)) {
                hashMap.clear();
                sparseArray.clear();
                this.e.a();
            }
        }

        @Override // o.C9355rt.c
        public void h(C9106qt c9106qt, boolean z) {
            this.f = true;
        }

        public final int i(C9106qt c9106qt, int i2) {
            int i3;
            int hashCode;
            int hashCode2 = (c9106qt.a * 31) + c9106qt.b.hashCode();
            if (i2 < 2) {
                long g = InterfaceC6278fM.g(c9106qt.d());
                i3 = hashCode2 * 31;
                hashCode = (int) (g ^ (g >>> 32));
            } else {
                i3 = hashCode2 * 31;
                hashCode = c9106qt.d().hashCode();
            }
            return i3 + hashCode;
        }

        public final C9106qt j(int i2, DataInputStream dataInputStream) throws IOException {
            C9759tY s;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i2 >= 2) {
                s = C9355rt.s(dataInputStream);
            } else {
                long readLong = dataInputStream.readLong();
                C6533gM c6533gM = new C6533gM();
                C6533gM.h(c6533gM, readLong);
                s = C9759tY.f.h(c6533gM);
            }
            return new C9106qt(readInt, readUTF, s);
        }

        public final boolean k(HashMap<String, C9106qt> hashMap, SparseArray<String> sparseArray) {
            boolean z;
            if (!this.e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int readInt = dataInputStream2.readInt();
                    if (readInt >= 0 && readInt <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.b == null) {
                                TD2.t(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.b.init(2, (Key) TD2.o(this.c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.b));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.a) {
                            this.f = true;
                        }
                        int readInt2 = dataInputStream2.readInt();
                        int i2 = 0;
                        for (int i3 = 0; i3 < readInt2; i3++) {
                            C9106qt j2 = j(readInt, dataInputStream2);
                            hashMap.put(j2.b, j2);
                            sparseArray.put(j2.a, j2.b);
                            i2 += i(j2, readInt);
                        }
                        int readInt3 = dataInputStream2.readInt();
                        if (dataInputStream2.read() == -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (readInt3 == i2 && z) {
                            TD2.t(dataInputStream2);
                            return true;
                        }
                        TD2.t(dataInputStream2);
                        return false;
                    }
                    TD2.t(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        TD2.t(dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        TD2.t(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void l(C9106qt c9106qt, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(c9106qt.a);
            dataOutputStream.writeUTF(c9106qt.b);
            C9355rt.v(c9106qt.d(), dataOutputStream);
        }

        public final void m(HashMap<String, C9106qt> hashMap) throws IOException {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream f = this.e.f();
                C10724xU1 c10724xU1 = this.g;
                if (c10724xU1 == null) {
                    this.g = new C10724xU1(f);
                } else {
                    c10724xU1.a(f);
                }
                C10724xU1 c10724xU12 = this.g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(c10724xU12);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(this.a ? 1 : 0);
                    if (this.a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) TD2.o(this.d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) TD2.o(this.b)).init(1, (Key) TD2.o(this.c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(c10724xU12, this.b));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(hashMap.size());
                    int i2 = 0;
                    for (C9106qt c9106qt : hashMap.values()) {
                        l(c9106qt, dataOutputStream2);
                        i2 += i(c9106qt, 2);
                    }
                    dataOutputStream2.writeInt(i2);
                    this.e.b(dataOutputStream2);
                    TD2.t(null);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    TD2.t(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // o.C9355rt.c
        public void e(long j2) {
        }
    }
}
