package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import o.OL1;

/* renamed from: o.gj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC6622gj2 implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: a */
    public void readProperties(C6367fj2 c6367fj2, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readObject(this.b, c6367fj2.getTextOff());
            propertyReader.readObject(this.c, c6367fj2.getTextOn());
            propertyReader.readObject(this.d, c6367fj2.getThumbDrawable());
            propertyReader.readBoolean(this.e, c6367fj2.getShowText());
            propertyReader.readBoolean(this.f, c6367fj2.getSplitTrack());
            propertyReader.readInt(this.g, c6367fj2.getSwitchMinWidth());
            propertyReader.readInt(this.h, c6367fj2.getSwitchPadding());
            propertyReader.readInt(this.i, c6367fj2.getThumbTextPadding());
            propertyReader.readObject(this.j, c6367fj2.getThumbTintList());
            propertyReader.readObject(this.k, c6367fj2.getThumbTintMode());
            propertyReader.readObject(this.l, c6367fj2.getTrackDrawable());
            propertyReader.readObject(this.m, c6367fj2.getTrackTintList());
            propertyReader.readObject(this.n, c6367fj2.getTrackTintMode());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapObject;
        int mapObject2;
        int mapObject3;
        int mapBoolean;
        int mapBoolean2;
        int mapInt;
        int mapInt2;
        int mapInt3;
        int mapObject4;
        int mapObject5;
        int mapObject6;
        int mapObject7;
        int mapObject8;
        mapObject = propertyMapper.mapObject("textOff", 16843045);
        this.b = mapObject;
        mapObject2 = propertyMapper.mapObject("textOn", 16843044);
        this.c = mapObject2;
        mapObject3 = propertyMapper.mapObject("thumb", 16843074);
        this.d = mapObject3;
        mapBoolean = propertyMapper.mapBoolean("showText", OL1.b.T2);
        this.e = mapBoolean;
        mapBoolean2 = propertyMapper.mapBoolean("splitTrack", OL1.b.Z2);
        this.f = mapBoolean2;
        mapInt = propertyMapper.mapInt("switchMinWidth", OL1.b.j3);
        this.g = mapInt;
        mapInt2 = propertyMapper.mapInt("switchPadding", OL1.b.k3);
        this.h = mapInt2;
        mapInt3 = propertyMapper.mapInt("thumbTextPadding", OL1.b.B3);
        this.i = mapInt3;
        mapObject4 = propertyMapper.mapObject("thumbTint", OL1.b.C3);
        this.j = mapObject4;
        mapObject5 = propertyMapper.mapObject("thumbTintMode", OL1.b.D3);
        this.k = mapObject5;
        mapObject6 = propertyMapper.mapObject("track", OL1.b.Y3);
        this.l = mapObject6;
        mapObject7 = propertyMapper.mapObject("trackTint", OL1.b.Z3);
        this.m = mapObject7;
        mapObject8 = propertyMapper.mapObject("trackTintMode", OL1.b.a4);
        this.n = mapObject8;
        this.a = true;
    }
}
