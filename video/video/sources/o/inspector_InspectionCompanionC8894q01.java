package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;
import o.C3771Nr1;
import o.OL1;

/* renamed from: o.q01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC8894q01 implements InspectionCompanion {
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

    /* renamed from: o.q01$a */
    /* loaded from: classes.dex */
    public class a implements IntFunction<String> {
        public a() {
        }

        @Override // java.util.function.IntFunction
        /* renamed from: a */
        public String apply(int i) {
            if (i != 0) {
                if (i != 1) {
                    return String.valueOf(i);
                }
                return "vertical";
            }
            return "horizontal";
        }
    }

    /* renamed from: o.q01$b */
    /* loaded from: classes.dex */
    public class b implements IntFunction<Set<String>> {
        public b() {
        }

        @Override // java.util.function.IntFunction
        /* renamed from: a */
        public Set<String> apply(int i) {
            HashSet hashSet = new HashSet();
            if (i == 0) {
                hashSet.add("none");
            }
            if (i == 1) {
                hashSet.add("beginning");
            }
            if (i == 2) {
                hashSet.add("middle");
            }
            if (i == 4) {
                hashSet.add("end");
            }
            return hashSet;
        }
    }

    /* renamed from: a */
    public void readProperties(androidx.appcompat.widget.d dVar, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readBoolean(this.b, dVar.w());
            propertyReader.readInt(this.c, dVar.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.d, dVar.getGravity());
            propertyReader.readIntEnum(this.e, dVar.getOrientation());
            propertyReader.readFloat(this.f, dVar.getWeightSum());
            propertyReader.readObject(this.g, dVar.getDividerDrawable());
            propertyReader.readInt(this.h, dVar.getDividerPadding());
            propertyReader.readBoolean(this.i, dVar.x());
            propertyReader.readIntFlag(this.j, dVar.getShowDividers());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapBoolean;
        int mapInt;
        int mapGravity;
        int mapIntEnum;
        int mapFloat;
        int mapObject;
        int mapInt2;
        int mapBoolean2;
        int mapIntFlag;
        mapBoolean = propertyMapper.mapBoolean("baselineAligned", 16843046);
        this.b = mapBoolean;
        mapInt = propertyMapper.mapInt("baselineAlignedChildIndex", 16843047);
        this.c = mapInt;
        mapGravity = propertyMapper.mapGravity(C3771Nr1.A.I, 16842927);
        this.d = mapGravity;
        mapIntEnum = propertyMapper.mapIntEnum("orientation", 16842948, new a());
        this.e = mapIntEnum;
        mapFloat = propertyMapper.mapFloat("weightSum", 16843048);
        this.f = mapFloat;
        mapObject = propertyMapper.mapObject("divider", OL1.b.b1);
        this.g = mapObject;
        mapInt2 = propertyMapper.mapInt("dividerPadding", OL1.b.d1);
        this.h = mapInt2;
        mapBoolean2 = propertyMapper.mapBoolean("measureWithLargestChild", OL1.b.k2);
        this.i = mapBoolean2;
        mapIntFlag = propertyMapper.mapIntFlag("showDividers", OL1.b.S2, new b());
        this.j = mapIntFlag;
        this.a = true;
    }
}
