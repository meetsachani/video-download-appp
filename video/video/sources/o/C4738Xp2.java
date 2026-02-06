package o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.Xp2 */
/* loaded from: classes.dex */
public final class C4738Xp2 {
    public final byte[] a;
    public String b;
    public List<byte[]> c;

    public C4738Xp2(byte[] bArr) {
        this.a = bArr;
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2);
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        if (bArr.length == bArr2.length) {
            return 0;
        }
        return bArr.length - bArr2.length;
    }

    public static C4738Xp2 c(String str, List<byte[]> list) throws IOException {
        return new C4738Xp2(d(str, list), str, list);
    }

    public static byte[] d(String str, List<byte[]> list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: o.Wp2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4738Xp2.a((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static C4738Xp2 e(byte[] bArr) {
        return new C4738Xp2(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4738Xp2.class == obj.getClass()) {
            return Arrays.equals(this.a, ((C4738Xp2) obj).a);
        }
        return false;
    }

    public byte[] f(int i) throws IOException {
        i();
        List<byte[]> list = this.c;
        if (list != null) {
            return Arrays.copyOf(list.get(i), this.c.get(i).length);
        }
        throw new IllegalStateException();
    }

    public int g() throws IOException {
        i();
        List<byte[]> list = this.c;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    public String h() throws IOException {
        i();
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final void i() throws IOException {
        if (this.b == null) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.a));
            this.b = dataInputStream.readUTF();
            int readInt = dataInputStream.readInt();
            this.c = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = dataInputStream.readInt();
                byte[] bArr = new byte[readInt2];
                if (dataInputStream.read(bArr) == readInt2) {
                    this.c.add(bArr);
                } else {
                    throw new IllegalStateException("Could not read fingerprint");
                }
            }
        }
    }

    public byte[] j() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public C4738Xp2(byte[] bArr, String str, List<byte[]> list) {
        this.a = bArr;
        this.b = str;
        this.c = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
