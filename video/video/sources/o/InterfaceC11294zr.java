package o;

import java.io.DataInput;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.zr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC11294zr extends DataInput {
    @Override // java.io.DataInput
    @InterfaceC6181ey
    boolean readBoolean();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    byte readByte();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    char readChar();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    double readDouble();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] bArr);

    @Override // java.io.DataInput
    void readFully(byte[] bArr, int i, int i2);

    @Override // java.io.DataInput
    @InterfaceC6181ey
    int readInt();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    @MB
    String readLine();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    long readLong();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    short readShort();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    String readUTF();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    int readUnsignedByte();

    @Override // java.io.DataInput
    @InterfaceC6181ey
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int i);
}
