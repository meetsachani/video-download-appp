package o;

import com.facebook.internal.InterfaceC2365j;

/* renamed from: o.Fi1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2952Fi1 implements InterfaceC2365j {
    MESSAGE_DIALOG(com.facebook.internal.Z.q),
    PHOTOS(com.facebook.internal.Z.s),
    VIDEO(com.facebook.internal.Z.x),
    MESSENGER_GENERIC_TEMPLATE(com.facebook.internal.Z.F),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(com.facebook.internal.Z.F),
    MESSENGER_MEDIA_TEMPLATE(com.facebook.internal.Z.F);
    
    public int X;

    EnumC2952Fi1(int minVersion) {
        this.X = minVersion;
    }

    @Override // com.facebook.internal.InterfaceC2365j
    public int e() {
        return this.X;
    }

    @Override // com.facebook.internal.InterfaceC2365j
    public String g() {
        return com.facebook.internal.Z.j0;
    }
}
