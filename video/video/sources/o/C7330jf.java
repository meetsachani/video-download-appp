package o;

import android.Manifest;
import com.facebook.internal.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.C11156zH;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,25321:1\n12687#1,2:25322\n12697#1,2:25324\n1310#1,2:25326\n1318#1,2:25328\n1326#1,2:25330\n1334#1,2:25332\n1342#1,2:25334\n1350#1,2:25336\n1358#1,2:25338\n1366#1,2:25340\n1374#1,2:25342\n2353#1,5:25344\n2366#1,5:25349\n2379#1,5:25354\n2392#1,5:25359\n2405#1,5:25364\n2418#1,5:25369\n2431#1,5:25374\n2444#1,5:25379\n2457#1,5:25384\n4344#1,2:25390\n4354#1,2:25392\n4364#1,2:25394\n4374#1,2:25396\n4384#1,2:25398\n4394#1,2:25400\n4404#1,2:25402\n4414#1,2:25404\n4424#1,2:25406\n4011#1:25408\n13537#1,2:25409\n4012#1,2:25411\n13539#1:25413\n4014#1:25414\n4025#1:25415\n13547#1,2:25416\n4026#1,2:25418\n13549#1:25420\n4028#1:25421\n4039#1:25422\n13557#1,2:25423\n4040#1,2:25425\n13559#1:25427\n4042#1:25428\n4053#1:25429\n13567#1,2:25430\n4054#1,2:25432\n13569#1:25434\n4056#1:25435\n4067#1:25436\n13577#1,2:25437\n4068#1,2:25439\n13579#1:25441\n4070#1:25442\n4081#1:25443\n13587#1,2:25444\n4082#1,2:25446\n13589#1:25448\n4084#1:25449\n4095#1:25450\n13597#1,2:25451\n4096#1,2:25453\n13599#1:25455\n4098#1:25456\n4109#1:25457\n13607#1,2:25458\n4110#1,2:25460\n13609#1:25462\n4112#1:25463\n4123#1:25464\n13617#1,2:25465\n4124#1,2:25467\n13619#1:25469\n4126#1:25470\n13537#1,3:25471\n13547#1,3:25474\n13557#1,3:25477\n13567#1,3:25480\n13577#1,3:25483\n13587#1,3:25486\n13597#1,3:25489\n13607#1,3:25492\n13617#1,3:25495\n4144#1,2:25498\n4254#1,2:25500\n4264#1,2:25502\n4274#1,2:25504\n4284#1,2:25506\n4294#1,2:25508\n4304#1,2:25510\n4314#1,2:25512\n4324#1,2:25514\n4334#1,2:25516\n9251#1,4:25518\n9266#1,4:25522\n9281#1,4:25526\n9296#1,4:25530\n9311#1,4:25534\n9326#1,4:25538\n9341#1,4:25542\n9356#1,4:25546\n9371#1,4:25550\n8964#1,4:25554\n8980#1,4:25558\n8996#1,4:25562\n9012#1,4:25566\n9028#1,4:25570\n9044#1,4:25574\n9060#1,4:25578\n9076#1,4:25582\n9092#1,4:25586\n9108#1,4:25590\n9124#1,4:25594\n9140#1,4:25598\n9156#1,4:25602\n9172#1,4:25606\n9188#1,4:25610\n9204#1,4:25614\n9220#1,4:25618\n9236#1,4:25622\n9539#1,4:25626\n10557#1,5:25630\n10568#1,5:25635\n10579#1,5:25640\n10590#1,5:25645\n10601#1,5:25650\n10612#1,5:25655\n10623#1,5:25660\n10634#1,5:25665\n10645#1,5:25670\n10660#1,5:25675\n10901#1,3:25680\n10904#1,3:25690\n10918#1,3:25693\n10921#1,3:25703\n10935#1,3:25706\n10938#1,3:25716\n10952#1,3:25719\n10955#1,3:25729\n10969#1,3:25732\n10972#1,3:25742\n10986#1,3:25745\n10989#1,3:25755\n11003#1,3:25758\n11006#1,3:25768\n11020#1,3:25771\n11023#1,3:25781\n11037#1,3:25784\n11040#1,3:25794\n11055#1,3:25797\n11058#1,3:25807\n11073#1,3:25810\n11076#1,3:25820\n11091#1,3:25823\n11094#1,3:25833\n11109#1,3:25836\n11112#1,3:25846\n11127#1,3:25849\n11130#1,3:25859\n11145#1,3:25862\n11148#1,3:25872\n11163#1,3:25875\n11166#1,3:25885\n11181#1,3:25888\n11184#1,3:25898\n11199#1,3:25901\n11202#1,3:25911\n11563#1,3:26040\n11573#1,3:26043\n11583#1,3:26046\n11593#1,3:26049\n11603#1,3:26052\n11613#1,3:26055\n11623#1,3:26058\n11633#1,3:26061\n11643#1,3:26064\n11429#1,4:26067\n11442#1,4:26071\n11455#1,4:26075\n11468#1,4:26079\n11481#1,4:26083\n11494#1,4:26087\n11507#1,4:26091\n11520#1,4:26095\n11533#1,4:26099\n11418#1:26103\n13537#1,2:26104\n13539#1:26107\n11419#1:26108\n13537#1,3:26109\n11554#1:26112\n13472#1:26113\n13473#1:26115\n11555#1:26116\n13472#1,2:26117\n13537#1,3:26119\n13547#1,3:26122\n13557#1,3:26125\n13567#1,3:26128\n13577#1,3:26131\n13587#1,3:26134\n13597#1,3:26137\n13607#1,3:26140\n13617#1,3:26143\n21540#1,2:26146\n21542#1,6:26149\n21756#1,2:26155\n21758#1,6:26158\n23933#1,6:26164\n23949#1,6:26170\n23965#1,6:26176\n23981#1,6:26182\n23997#1,6:26188\n24013#1,6:26194\n24029#1,6:26200\n24045#1,6:26206\n24061#1,6:26212\n24167#1,8:26218\n24185#1,8:26226\n24203#1,8:26234\n24221#1,8:26242\n24239#1,8:26250\n24257#1,8:26258\n24275#1,8:26266\n24293#1,8:26274\n24311#1,8:26282\n24409#1,6:26290\n24425#1,6:26296\n24441#1,6:26302\n24457#1,6:26308\n24473#1,6:26314\n24489#1,6:26320\n24505#1,6:26326\n24521#1,6:26332\n1#2:25389\n1#2:26106\n1#2:26114\n1#2:26148\n1#2:26157\n384#3,7:25683\n384#3,7:25696\n384#3,7:25709\n384#3,7:25722\n384#3,7:25735\n384#3,7:25748\n384#3,7:25761\n384#3,7:25774\n384#3,7:25787\n384#3,7:25800\n384#3,7:25813\n384#3,7:25826\n384#3,7:25839\n384#3,7:25852\n384#3,7:25865\n384#3,7:25878\n384#3,7:25891\n384#3,7:25904\n384#3,7:25914\n384#3,7:25921\n384#3,7:25928\n384#3,7:25935\n384#3,7:25942\n384#3,7:25949\n384#3,7:25956\n384#3,7:25963\n384#3,7:25970\n384#3,7:25977\n384#3,7:25984\n384#3,7:25991\n384#3,7:25998\n384#3,7:26005\n384#3,7:26012\n384#3,7:26019\n384#3,7:26026\n384#3,7:26033\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n557#1:25322,2\n566#1:25324,2\n860#1:25326,2\n870#1:25328,2\n880#1:25330,2\n890#1:25332,2\n900#1:25334,2\n910#1:25336,2\n920#1:25338,2\n930#1:25340,2\n940#1:25342,2\n950#1:25344,5\n960#1:25349,5\n970#1:25354,5\n980#1:25359,5\n990#1:25364,5\n1000#1:25369,5\n1010#1:25374,5\n1020#1:25379,5\n1030#1:25384,5\n3829#1:25390,2\n3838#1:25392,2\n3847#1:25394,2\n3856#1:25396,2\n3865#1:25398,2\n3874#1:25400,2\n3883#1:25402,2\n3892#1:25404,2\n3901#1:25406,2\n3912#1:25408\n3912#1:25409,2\n3912#1:25411,2\n3912#1:25413\n3912#1:25414\n3923#1:25415\n3923#1:25416,2\n3923#1:25418,2\n3923#1:25420\n3923#1:25421\n3934#1:25422\n3934#1:25423,2\n3934#1:25425,2\n3934#1:25427\n3934#1:25428\n3945#1:25429\n3945#1:25430,2\n3945#1:25432,2\n3945#1:25434\n3945#1:25435\n3956#1:25436\n3956#1:25437,2\n3956#1:25439,2\n3956#1:25441\n3956#1:25442\n3967#1:25443\n3967#1:25444,2\n3967#1:25446,2\n3967#1:25448\n3967#1:25449\n3978#1:25450\n3978#1:25451,2\n3978#1:25453,2\n3978#1:25455\n3978#1:25456\n3989#1:25457\n3989#1:25458,2\n3989#1:25460,2\n3989#1:25462\n3989#1:25463\n4000#1:25464\n4000#1:25465,2\n4000#1:25467,2\n4000#1:25469\n4000#1:25470\n4011#1:25471,3\n4025#1:25474,3\n4039#1:25477,3\n4053#1:25480,3\n4067#1:25483,3\n4081#1:25486,3\n4095#1:25489,3\n4109#1:25492,3\n4123#1:25495,3\n4135#1:25498,2\n4154#1:25500,2\n4163#1:25502,2\n4172#1:25504,2\n4181#1:25506,2\n4190#1:25508,2\n4199#1:25510,2\n4208#1:25512,2\n4217#1:25514,2\n4226#1:25516,2\n8570#1:25518,4\n8585#1:25522,4\n8600#1:25526,4\n8615#1:25530,4\n8630#1:25534,4\n8645#1:25538,4\n8660#1:25542,4\n8675#1:25546,4\n8690#1:25550,4\n8705#1:25554,4\n8720#1:25558,4\n8735#1:25562,4\n8750#1:25566,4\n8765#1:25570,4\n8780#1:25574,4\n8795#1:25578,4\n8810#1:25582,4\n8825#1:25586,4\n8839#1:25590,4\n8853#1:25594,4\n8867#1:25598,4\n8881#1:25602,4\n8895#1:25606,4\n8909#1:25610,4\n8923#1:25614,4\n8937#1:25618,4\n8951#1:25622,4\n9390#1:25626,4\n10135#1:25630,5\n10144#1:25635,5\n10153#1:25640,5\n10162#1:25645,5\n10171#1:25650,5\n10180#1:25655,5\n10189#1:25660,5\n10198#1:25665,5\n10207#1:25670,5\n10220#1:25675,5\n10676#1:25680,3\n10676#1:25690,3\n10688#1:25693,3\n10688#1:25703,3\n10700#1:25706,3\n10700#1:25716,3\n10712#1:25719,3\n10712#1:25729,3\n10724#1:25732,3\n10724#1:25742,3\n10736#1:25745,3\n10736#1:25755,3\n10748#1:25758,3\n10748#1:25768,3\n10760#1:25771,3\n10760#1:25781,3\n10772#1:25784,3\n10772#1:25794,3\n10785#1:25797,3\n10785#1:25807,3\n10798#1:25810,3\n10798#1:25820,3\n10811#1:25823,3\n10811#1:25833,3\n10824#1:25836,3\n10824#1:25846,3\n10837#1:25849,3\n10837#1:25859,3\n10850#1:25862,3\n10850#1:25872,3\n10863#1:25875,3\n10863#1:25885,3\n10876#1:25888,3\n10876#1:25898,3\n10889#1:25901,3\n10889#1:25911,3\n11228#1:26040,3\n11238#1:26043,3\n11248#1:26046,3\n11258#1:26049,3\n11268#1:26052,3\n11278#1:26055,3\n11288#1:26058,3\n11298#1:26061,3\n11308#1:26064,3\n11318#1:26067,4\n11328#1:26071,4\n11338#1:26075,4\n11348#1:26079,4\n11358#1:26083,4\n11368#1:26087,4\n11378#1:26091,4\n11388#1:26095,4\n11398#1:26099,4\n11408#1:26103\n11408#1:26104,2\n11408#1:26107\n11408#1:26108\n11418#1:26109,3\n11546#1:26112\n11546#1:26113\n11546#1:26115\n11546#1:26116\n11554#1:26117,2\n19826#1:26119,3\n19838#1:26122,3\n19850#1:26125,3\n19862#1:26128,3\n19874#1:26131,3\n19886#1:26134,3\n19898#1:26137,3\n19910#1:26140,3\n19922#1:26143,3\n22370#1:26146,2\n22370#1:26149,6\n22523#1:26155,2\n22523#1:26158,6\n23842#1:26164,6\n23852#1:26170,6\n23862#1:26176,6\n23872#1:26182,6\n23882#1:26188,6\n23892#1:26194,6\n23902#1:26200,6\n23912#1:26206,6\n23922#1:26212,6\n24076#1:26218,8\n24086#1:26226,8\n24096#1:26234,8\n24106#1:26242,8\n24116#1:26250,8\n24126#1:26258,8\n24136#1:26266,8\n24146#1:26274,8\n24156#1:26282,8\n24328#1:26290,6\n24338#1:26296,6\n24348#1:26302,6\n24358#1:26308,6\n24368#1:26314,6\n24378#1:26320,6\n24388#1:26326,6\n24398#1:26332,6\n11408#1:26106\n11546#1:26114\n22370#1:26148\n22523#1:26157\n10676#1:25683,7\n10688#1:25696,7\n10700#1:25709,7\n10712#1:25722,7\n10724#1:25735,7\n10736#1:25748,7\n10748#1:25761,7\n10760#1:25774,7\n10772#1:25787,7\n10785#1:25800,7\n10798#1:25813,7\n10811#1:25826,7\n10824#1:25839,7\n10837#1:25852,7\n10850#1:25865,7\n10863#1:25878,7\n10876#1:25891,7\n10889#1:25904,7\n10903#1:25914,7\n10920#1:25921,7\n10937#1:25928,7\n10954#1:25935,7\n10971#1:25942,7\n10988#1:25949,7\n11005#1:25956,7\n11022#1:25963,7\n11039#1:25970,7\n11057#1:25977,7\n11075#1:25984,7\n11093#1:25991,7\n11111#1:25998,7\n11129#1:26005,7\n11147#1:26012,7\n11165#1:26019,7\n11183#1:26026,7\n11201#1:26033,7\n*E\n"})
/* renamed from: o.jf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7330jf extends C4788Ye {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24864#2:18\n*E\n"})
    /* renamed from: o.jf$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterable<T>, GW0 {
        public final /* synthetic */ Object[] X;

        public a(Object[] objArr) {
            this.X = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C9046qe.a(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24872#2:18\n*E\n"})
    /* renamed from: o.jf$b */
    /* loaded from: classes3.dex */
    public static final class b implements Iterable<Byte>, GW0 {
        public final /* synthetic */ byte[] X;

        public b(byte[] bArr) {
            this.X = bArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Byte> iterator() {
            return C9295re.b(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24880#2:18\n*E\n"})
    /* renamed from: o.jf$c */
    /* loaded from: classes3.dex */
    public static final class c implements Iterable<Short>, GW0 {
        public final /* synthetic */ short[] X;

        public c(short[] sArr) {
            this.X = sArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Short> iterator() {
            return C9295re.h(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24888#2:18\n*E\n"})
    /* renamed from: o.jf$d */
    /* loaded from: classes3.dex */
    public static final class d implements Iterable<Integer>, GW0 {
        public final /* synthetic */ int[] X;

        public d(int[] iArr) {
            this.X = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Integer> iterator() {
            return C9295re.f(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24896#2:18\n*E\n"})
    /* renamed from: o.jf$e */
    /* loaded from: classes3.dex */
    public static final class e implements Iterable<Long>, GW0 {
        public final /* synthetic */ long[] X;

        public e(long[] jArr) {
            this.X = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Long> iterator() {
            return C9295re.g(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24904#2:18\n*E\n"})
    /* renamed from: o.jf$f */
    /* loaded from: classes3.dex */
    public static final class f implements Iterable<Float>, GW0 {
        public final /* synthetic */ float[] X;

        public f(float[] fArr) {
            this.X = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Float> iterator() {
            return C9295re.e(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24912#2:18\n*E\n"})
    /* renamed from: o.jf$g */
    /* loaded from: classes3.dex */
    public static final class g implements Iterable<Double>, GW0 {
        public final /* synthetic */ double[] X;

        public g(double[] dArr) {
            this.X = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Double> iterator() {
            return C9295re.d(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24920#2:18\n*E\n"})
    /* renamed from: o.jf$h */
    /* loaded from: classes3.dex */
    public static final class h implements Iterable<Boolean>, GW0 {
        public final /* synthetic */ boolean[] X;

        public h(boolean[] zArr) {
            this.X = zArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Boolean> iterator() {
            return C9295re.a(this.X);
        }
    }

    @InterfaceC8303na2({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24928#2:18\n*E\n"})
    /* renamed from: o.jf$i */
    /* loaded from: classes3.dex */
    public static final class i implements Iterable<Character>, GW0 {
        public final /* synthetic */ char[] X;

        public i(char[] cArr) {
            this.X = cArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return C9295re.c(this.X);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24938#2:23\n*E\n"})
    /* renamed from: o.jf$j */
    /* loaded from: classes3.dex */
    public static final class j<T> implements B02<T> {
        public final /* synthetic */ Object[] a;

        public j(Object[] objArr) {
            this.a = objArr;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            return C9046qe.a(this.a);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24948#2:23\n*E\n"})
    /* renamed from: o.jf$k */
    /* loaded from: classes3.dex */
    public static final class k implements B02<Byte> {
        public final /* synthetic */ byte[] a;

        public k(byte[] bArr) {
            this.a = bArr;
        }

        @Override // o.B02
        public Iterator<Byte> iterator() {
            return C9295re.b(this.a);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24958#2:23\n*E\n"})
    /* renamed from: o.jf$l */
    /* loaded from: classes3.dex */
    public static final class l implements B02<Short> {
        public final /* synthetic */ short[] a;

        public l(short[] sArr) {
            this.a = sArr;
        }

        @Override // o.B02
        public Iterator<Short> iterator() {
            return C9295re.h(this.a);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24968#2:23\n*E\n"})
    /* renamed from: o.jf$m */
    /* loaded from: classes3.dex */
    public static final class m implements B02<Integer> {
        public final /* synthetic */ int[] a;

        public m(int[] iArr) {
            this.a = iArr;
        }

        @Override // o.B02
        public Iterator<Integer> iterator() {
            return C9295re.f(this.a);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24978#2:23\n*E\n"})
    /* renamed from: o.jf$n */
    /* loaded from: classes3.dex */
    public static final class n implements B02<Long> {
        public final /* synthetic */ long[] a;

        public n(long[] jArr) {
            this.a = jArr;
        }

        @Override // o.B02
        public Iterator<Long> iterator() {
            return C9295re.g(this.a);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24988#2:23\n*E\n"})
    /* renamed from: o.jf$o */
    /* loaded from: classes3.dex */
    public static final class o implements B02<Float> {
        public final /* synthetic */ float[] a;

        public o(float[] fArr) {
            this.a = fArr;
        }

        @Override // o.B02
        public Iterator<Float> iterator() {
            return C9295re.e(this.a);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n24998#2:23\n*E\n"})
    /* renamed from: o.jf$p */
    /* loaded from: classes3.dex */
    public static final class p implements B02<Double> {
        public final /* synthetic */ double[] a;

        public p(double[] dArr) {
            this.a = dArr;
        }

        @Override // o.B02
        public Iterator<Double> iterator() {
            return C9295re.d(this.a);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n25008#2:23\n*E\n"})
    /* renamed from: o.jf$q */
    /* loaded from: classes3.dex */
    public static final class q implements B02<Boolean> {
        public final /* synthetic */ boolean[] a;

        public q(boolean[] zArr) {
            this.a = zArr;
        }

        @Override // o.B02
        public Iterator<Boolean> iterator() {
            return C9295re.a(this.a);
        }
    }

    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n25018#2:23\n*E\n"})
    /* renamed from: o.jf$r */
    /* loaded from: classes3.dex */
    public static final class r implements B02<Character> {
        public final /* synthetic */ char[] a;

        public r(char[] cArr) {
            this.a = cArr;
        }

        @Override // o.B02
        public Iterator<Character> iterator() {
            return C9295re.c(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* renamed from: o.jf$s */
    /* loaded from: classes3.dex */
    public static final class s<K, T> implements UE0<T, K> {
        public final /* synthetic */ T[] a;
        public final /* synthetic */ HA0<T, K> b;

        /* JADX WARN: Multi-variable type inference failed */
        public s(T[] tArr, HA0<? super T, ? extends K> ha0) {
            this.a = tArr;
            this.b = ha0;
        }

        @Override // o.UE0
        public K a(T t) {
            return this.b.invoke(t);
        }

        @Override // o.UE0
        public Iterator<T> b() {
            return C9046qe.a(this.a);
        }
    }

    public static boolean A5(@NotNull short[] sArr) {
        boolean z;
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M A6(@NotNull char[] cArr, @NotNull M m2, @NotNull HA0<? super Character, ? extends K> ha0, @NotNull HA0<? super Character, ? extends V> ha02) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (char c2 : cArr) {
            m2.put(ha0.invoke(Character.valueOf(c2)), ha02.invoke(Character.valueOf(c2)));
        }
        return m2;
    }

    @InterfaceC8046mW0(name = "averageOfLong")
    public static final double A7(@NotNull Long[] lArr) {
        C6562gT0.p(lArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Long l2 : lArr) {
            d2 += l2.longValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    public static boolean A8(@NotNull long[] jArr, long j2) {
        C6562gT0.p(jArr, "<this>");
        if (Rf(jArr, j2) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final List<Float> A9(@NotNull float[] fArr, int i2) {
        C6562gT0.p(fArr, "<this>");
        if (i2 >= 0) {
            return Ix(fArr, C5075aO1.u(fArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, V> List<V> AA(@NotNull int[] iArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super Integer, ? super R, ? extends V> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(Integer.valueOf(iArr[i2]), obj));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> Aa(@NotNull char[] cArr, @NotNull VA0<? super Integer, ? super Character, Boolean> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    public static final Float Ab(float[] fArr, HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Ac(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            C9444sF.q0(arrayList, ha0.invoke(Byte.valueOf(b2)));
        }
        return arrayList;
    }

    public static final <R> R Ad(@NotNull float[] fArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super Float, ? extends R> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, Float.valueOf(fArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static final int Ae(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return cArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Af(@NotNull float[] fArr, @NotNull M m2, @NotNull HA0<? super Float, ? extends K> ha0, @NotNull HA0<? super Float, ? extends V> ha02) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (float f2 : fArr) {
            K invoke = ha0.invoke(Float.valueOf(f2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Float.valueOf(f2)));
        }
        return m2;
    }

    @XP0
    public static final boolean Ag(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final char Ah(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[Ae(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Ai(@NotNull byte[] bArr, @NotNull VA0<? super Integer, ? super Byte, ? extends R> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), Byte.valueOf(bArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Aj(float[] fArr, HA0<? super Float, Double> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            double doubleValue = ha0.invoke(Float.valueOf(fArr[0])).doubleValue();
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Float.valueOf(fArr[i2])).doubleValue());
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Ak(char[] cArr, Comparator<? super R> comparator, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            Object obj = (R) ha0.invoke(Character.valueOf(cArr[0]));
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    R invoke = ha0.invoke(Character.valueOf(cArr[i2]));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T> T Al(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (tArr.length != 0) {
            T t = tArr[0];
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    T t2 = tArr[i2];
                    if (comparator.compare(t, t2) < 0) {
                        t = t2;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Am(int[] iArr, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Integer.valueOf(iArr[0]));
        int De = De(iArr);
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                R invoke2 = ha0.invoke(Integer.valueOf(iArr[i2]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final char An(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length != 0) {
            char c2 = cArr[0];
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    char c3 = cArr[i2];
                    if (C6562gT0.t(c2, c3) > 0) {
                        c2 = c3;
                    }
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return c2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T> T[] Ao(T[] tArr, HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (T t : tArr) {
            ha0.invoke(t);
        }
        return tArr;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long Ap(@NotNull long[] jArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[abstractC10696xN1.m(jArr.length)]);
    }

    public static final double Aq(@NotNull double[] dArr, @NotNull XA0<? super Integer, ? super Double, ? super Double, Double> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Be = Be(dArr);
        if (Be >= 0) {
            double d2 = dArr[Be];
            for (int i2 = Be - 1; i2 >= 0; i2--) {
                d2 = xa0.P(Integer.valueOf(i2), Double.valueOf(dArr[i2]), Double.valueOf(d2)).doubleValue();
            }
            return d2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Boolean> Ar(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return C8222nF.H();
        }
        List<Boolean> gz = gz(zArr);
        C9930uF.r1(gz);
        return gz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> List<R> As(@NotNull T[] tArr, R r2, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (tArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r2);
        for (Manifest manifest : tArr) {
            r2 = va0.i(r2, manifest);
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Byte At(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Byte b2 = null;
        boolean z = false;
        for (byte b3 : bArr) {
            if (ha0.invoke(Byte.valueOf(b3)).booleanValue()) {
                if (z) {
                    return null;
                }
                b2 = Byte.valueOf(b3);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return b2;
    }

    public static final <T, R extends Comparable<? super R>> void Au(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length > 1) {
            C4788Ye.h4(tArr, new C11156zH.c(ha0));
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> Av(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Rv(cArr, new C11156zH.c(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double Aw(@NotNull float[] fArr, @NotNull HA0<? super Float, Double> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (float f2 : fArr) {
            d2 += ha0.invoke(Float.valueOf(f2)).doubleValue();
        }
        return d2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long Ax(int[] iArr, HA0<? super Integer, C9860tx2> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (int i2 : iArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(Integer.valueOf(i2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C Ay(@NotNull short[] sArr, @NotNull C c2) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (short s2 : sArr) {
            c2.add(Short.valueOf(s2));
        }
        return c2;
    }

    @NotNull
    public static final Set<Byte> Az(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Byte> hz = hz(bArr);
        C9444sF.q0(hz, iterable);
        return hz;
    }

    public static final boolean B5(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Double>> M B6(@NotNull double[] dArr, @NotNull M m2, @NotNull HA0<? super Double, ? extends K> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (double d2 : dArr) {
            m2.put(ha0.invoke(Double.valueOf(d2)), Double.valueOf(d2));
        }
        return m2;
    }

    @InterfaceC8046mW0(name = "averageOfShort")
    public static final double B7(@NotNull Short[] shArr) {
        C6562gT0.p(shArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Short sh : shArr) {
            d2 += sh.shortValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    public static <T> boolean B8(@NotNull T[] tArr, T t) {
        C6562gT0.p(tArr, "<this>");
        if (Sf(tArr, t) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final List<Integer> B9(@NotNull int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        if (i2 >= 0) {
            return Jx(iArr, C5075aO1.u(iArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<C4180Rx1<Integer, Integer>> BA(@NotNull int[] iArr, @NotNull int[] iArr2) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iArr2, "other");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(Integer.valueOf(iArr[i2]), Integer.valueOf(iArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> Ba(@NotNull double[] dArr, @NotNull VA0<? super Integer, ? super Double, Boolean> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    public static final Integer Bb(int[] iArr, HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                return Integer.valueOf(i2);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Bc(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            C9444sF.q0(arrayList, ha0.invoke(Character.valueOf(c2)));
        }
        return arrayList;
    }

    public static final <R> R Bd(@NotNull int[] iArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super Integer, ? extends R> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, Integer.valueOf(iArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static final int Be(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return dArr.length - 1;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Integer>>> M Bf(@NotNull int[] iArr, @NotNull M m2, @NotNull HA0<? super Integer, ? extends K> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (int i2 : iArr) {
            K invoke = ha0.invoke(Integer.valueOf(i2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(Integer.valueOf(i2));
        }
        return m2;
    }

    @XP0
    public static final boolean Bg(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final char Bh(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char c2 = cArr[length];
                if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                    return c2;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Bi(@NotNull char[] cArr, @NotNull VA0<? super Integer, ? super Character, ? extends R> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), Character.valueOf(cArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Bj(int[] iArr, HA0<? super Integer, Double> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            double doubleValue = ha0.invoke(Integer.valueOf(iArr[0])).doubleValue();
            int De = De(iArr);
            int i2 = 1;
            if (1 <= De) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Integer.valueOf(iArr[i2])).doubleValue());
                    if (i2 == De) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Bk(double[] dArr, Comparator<? super R> comparator, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            Object obj = (R) ha0.invoke(Double.valueOf(dArr[0]));
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    R invoke = ha0.invoke(Double.valueOf(dArr[i2]));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final short Bl(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (sArr.length != 0) {
            short s2 = sArr[0];
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    short s3 = sArr[i2];
                    if (comparator.compare(Short.valueOf(s2), Short.valueOf(s3)) < 0) {
                        s2 = s3;
                    }
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return s2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Bm(long[] jArr, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Long.valueOf(jArr[0]));
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                R invoke2 = ha0.invoke(Long.valueOf(jArr[i2]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double Bn(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    d2 = Math.min(d2, dArr[i2]);
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final short[] Bo(short[] sArr, HA0<? super Short, C7458kA2> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (short s2 : sArr) {
            ha0.invoke(Short.valueOf(s2));
        }
        return sArr;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T> T Bp(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return (T) Cp(tArr, AbstractC10696xN1.X);
    }

    public static final float Bq(@NotNull float[] fArr, @NotNull XA0<? super Integer, ? super Float, ? super Float, Float> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Ce = Ce(fArr);
        if (Ce >= 0) {
            float f2 = fArr[Ce];
            for (int i2 = Ce - 1; i2 >= 0; i2--) {
                f2 = xa0.P(Integer.valueOf(i2), Float.valueOf(fArr[i2]), Float.valueOf(f2)).floatValue();
            }
            return f2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static byte[] Br(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int ze = ze(bArr);
        if (ze >= 0) {
            int i2 = 0;
            while (true) {
                bArr2[ze - i2] = bArr[i2];
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return bArr2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Bs(short[] sArr, R r2, VA0<? super R, ? super Short, ? extends R> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (sArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r2);
        for (short s2 : sArr) {
            r2 = va0.i(r2, Short.valueOf(s2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Character Bt(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final void Bu(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length > 1) {
            C4788Ye.G3(bArr);
            ar(bArr);
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> Bv(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Sv(dArr, new C11156zH.c(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double Bw(@NotNull int[] iArr, @NotNull HA0<? super Integer, Double> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (int i2 : iArr) {
            d2 += ha0.invoke(Integer.valueOf(i2)).doubleValue();
        }
        return d2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long Bx(long[] jArr, HA0<? super Long, C9860tx2> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (long j2 : jArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(Long.valueOf(j2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C By(@NotNull boolean[] zArr, @NotNull C c2) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (boolean z : zArr) {
            c2.add(Boolean.valueOf(z));
        }
        return c2;
    }

    @NotNull
    public static final Set<Character> Bz(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Character> iz = iz(cArr);
        C9444sF.q0(iz, iterable);
        return iz;
    }

    public static final boolean C5(@NotNull boolean[] zArr) {
        boolean z;
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M C6(@NotNull double[] dArr, @NotNull M m2, @NotNull HA0<? super Double, ? extends K> ha0, @NotNull HA0<? super Double, ? extends V> ha02) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (double d2 : dArr) {
            m2.put(ha0.invoke(Double.valueOf(d2)), ha02.invoke(Double.valueOf(d2)));
        }
        return m2;
    }

    @XP0
    public static final byte C7(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return bArr[0];
    }

    public static boolean C8(@NotNull short[] sArr, short s2) {
        C6562gT0.p(sArr, "<this>");
        if (Tf(sArr, s2) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final List<Long> C9(@NotNull long[] jArr, int i2) {
        C6562gT0.p(jArr, "<this>");
        if (i2 >= 0) {
            return Kx(jArr, C5075aO1.u(jArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <V> List<V> CA(@NotNull int[] iArr, @NotNull int[] iArr2, @NotNull VA0<? super Integer, ? super Integer, ? extends V> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iArr2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Integer.valueOf(iArr[i2]), Integer.valueOf(iArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> Ca(@NotNull float[] fArr, @NotNull VA0<? super Integer, ? super Float, Boolean> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    public static final Long Cb(long[] jArr, HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                return Long.valueOf(j2);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Cc(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            C9444sF.q0(arrayList, ha0.invoke(Double.valueOf(d2)));
        }
        return arrayList;
    }

    public static final <R> R Cd(@NotNull long[] jArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super Long, ? extends R> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, Long.valueOf(jArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static final int Ce(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return fArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Cf(@NotNull int[] iArr, @NotNull M m2, @NotNull HA0<? super Integer, ? extends K> ha0, @NotNull HA0<? super Integer, ? extends V> ha02) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (int i2 : iArr) {
            K invoke = ha0.invoke(Integer.valueOf(i2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Integer.valueOf(i2)));
        }
        return m2;
    }

    @XP0
    public static final <T> boolean Cg(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final double Ch(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[Be(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Ci(@NotNull double[] dArr, @NotNull VA0<? super Integer, ? super Double, ? extends R> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), Double.valueOf(dArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Cj(long[] jArr, HA0<? super Long, Double> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            double doubleValue = ha0.invoke(Long.valueOf(jArr[0])).doubleValue();
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Long.valueOf(jArr[i2])).doubleValue());
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Ck(float[] fArr, Comparator<? super R> comparator, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            Object obj = (R) ha0.invoke(Float.valueOf(fArr[0]));
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    R invoke = ha0.invoke(Float.valueOf(fArr[i2]));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final boolean Cl(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    boolean z2 = zArr[i2];
                    if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) < 0) {
                        z = z2;
                    }
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return z;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R Cm(T[] tArr, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(tArr[0]);
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                R invoke2 = ha0.invoke(tArr[i2]);
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double Cn(@NotNull Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length != 0) {
            double doubleValue = dArr[0].doubleValue();
            int Fe = Fe(dArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    doubleValue = Math.min(doubleValue, dArr[i2].doubleValue());
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean[] Co(boolean[] zArr, HA0<? super Boolean, C7458kA2> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (boolean z : zArr) {
            ha0.invoke(Boolean.valueOf(z));
        }
        return zArr;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T Cp(@NotNull T[] tArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[abstractC10696xN1.m(tArr.length)];
    }

    public static final int Cq(@NotNull int[] iArr, @NotNull XA0<? super Integer, ? super Integer, ? super Integer, Integer> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int De = De(iArr);
        if (De >= 0) {
            int i2 = iArr[De];
            for (int i3 = De - 1; i3 >= 0; i3--) {
                i2 = xa0.P(Integer.valueOf(i3), Integer.valueOf(iArr[i3]), Integer.valueOf(i2)).intValue();
            }
            return i2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final char[] Cr(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int Ae = Ae(cArr);
        if (Ae >= 0) {
            int i2 = 0;
            while (true) {
                cArr2[Ae - i2] = cArr[i2];
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return cArr2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Cs(boolean[] zArr, R r2, VA0<? super R, ? super Boolean, ? extends R> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (zArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r2);
        for (boolean z : zArr) {
            r2 = va0.i(r2, Boolean.valueOf(z));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Character Ct(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Character ch = null;
        boolean z = false;
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                if (z) {
                    return null;
                }
                ch = Character.valueOf(c2);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return ch;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Cu(@NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(bArr, "<this>");
        C4788Ye.H3(bArr, i2, i3);
        br(bArr, i2, i3);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> Cv(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Tv(fArr, new C11156zH.c(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double Cw(@NotNull long[] jArr, @NotNull HA0<? super Long, Double> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (long j2 : jArr) {
            d2 += ha0.invoke(Long.valueOf(j2)).doubleValue();
        }
        return d2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final <T> long Cx(T[] tArr, HA0<? super T, C9860tx2> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (T t : tArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(t).p0());
        }
        return n2;
    }

    @NotNull
    public static final double[] Cy(@NotNull Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr2[i2] = dArr[i2].doubleValue();
        }
        return dArr2;
    }

    @NotNull
    public static final Set<Double> Cz(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Double> jz = jz(dArr);
        C9444sF.q0(jz, iterable);
        return jz;
    }

    public static final boolean D5(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Float>> M D6(@NotNull float[] fArr, @NotNull M m2, @NotNull HA0<? super Float, ? extends K> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (float f2 : fArr) {
            m2.put(ha0.invoke(Float.valueOf(f2)), Float.valueOf(f2));
        }
        return m2;
    }

    @XP0
    public static final char D7(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return cArr[0];
    }

    public static final boolean D8(@NotNull boolean[] zArr, boolean z) {
        C6562gT0.p(zArr, "<this>");
        if (Uf(zArr, z) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final <T> List<T> D9(@NotNull T[] tArr, int i2) {
        C6562gT0.p(tArr, "<this>");
        if (i2 >= 0) {
            return Lx(tArr, C5075aO1.u(tArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<C4180Rx1<Integer, R>> DA(@NotNull int[] iArr, @NotNull R[] rArr) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            int i3 = iArr[i2];
            arrayList.add(C6670gv2.a(Integer.valueOf(i3), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> Da(@NotNull int[] iArr, @NotNull VA0<? super Integer, ? super Integer, Boolean> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            int i5 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            }
            i2++;
            i3 = i5;
        }
        return arrayList;
    }

    @XP0
    public static final <T> T Db(T[] tArr, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Dc(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            C9444sF.q0(arrayList, ha0.invoke(Float.valueOf(f2)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Dd(@NotNull T[] tArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, tArr[i2]);
            i2++;
            i3++;
        }
        return r2;
    }

    public static int De(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return iArr.length - 1;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Long>>> M Df(@NotNull long[] jArr, @NotNull M m2, @NotNull HA0<? super Long, ? extends K> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (long j2 : jArr) {
            K invoke = ha0.invoke(Long.valueOf(j2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(Long.valueOf(j2));
        }
        return m2;
    }

    @XP0
    public static final boolean Dg(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final double Dh(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                double d2 = dArr[length];
                if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                    return d2;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Di(@NotNull float[] fArr, @NotNull VA0<? super Integer, ? super Float, ? extends R> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), Float.valueOf(fArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double Dj(T[] tArr, HA0<? super T, Double> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            double doubleValue = ha0.invoke(tArr[0]).doubleValue();
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(tArr[i2]).doubleValue());
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Dk(int[] iArr, Comparator<? super R> comparator, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            Object obj = (R) ha0.invoke(Integer.valueOf(iArr[0]));
            int De = De(iArr);
            int i2 = 1;
            if (1 <= De) {
                while (true) {
                    R invoke = ha0.invoke(Integer.valueOf(iArr[i2]));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == De) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean Dl(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int He = He(zArr);
        if (He == 0) {
            return Boolean.valueOf(z);
        }
        R invoke = ha0.invoke(Boolean.valueOf(z));
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                boolean z2 = zArr[i2];
                R invoke2 = ha0.invoke(Boolean.valueOf(z2));
                if (invoke.compareTo(invoke2) > 0) {
                    z = z2;
                    invoke = invoke2;
                }
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Dm(short[] sArr, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Short.valueOf(sArr[0]));
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                R invoke2 = ha0.invoke(Short.valueOf(sArr[i2]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float Dn(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length != 0) {
            float f2 = fArr[0];
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    f2 = Math.min(f2, fArr[i2]);
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return f2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final byte[] Do(byte[] bArr, VA0<? super Integer, ? super Byte, C7458kA2> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Byte.valueOf(bArr[i2]));
            i2++;
            i3++;
        }
        return bArr;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Short Dp(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return Ep(sArr, AbstractC10696xN1.X);
    }

    public static final long Dq(@NotNull long[] jArr, @NotNull XA0<? super Integer, ? super Long, ? super Long, Long> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Ee = Ee(jArr);
        if (Ee >= 0) {
            long j2 = jArr[Ee];
            for (int i2 = Ee - 1; i2 >= 0; i2--) {
                j2 = xa0.P(Integer.valueOf(i2), Long.valueOf(jArr[i2]), Long.valueOf(j2)).longValue();
            }
            return j2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final double[] Dr(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int Be = Be(dArr);
        if (Be >= 0) {
            int i2 = 0;
            while (true) {
                dArr2[Be - i2] = dArr[i2];
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return dArr2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Ds(byte[] bArr, R r2, XA0<? super Integer, ? super R, ? super Byte, ? extends R> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (bArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r2);
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Byte.valueOf(bArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Double Dt(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final void Du(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length > 1) {
            C4788Ye.I3(cArr);
            cr(cArr);
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> Dv(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Uv(iArr, new C11156zH.c(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final <T> double Dw(@NotNull T[] tArr, @NotNull HA0<? super T, Double> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (T t : tArr) {
            d2 += ha0.invoke(t).doubleValue();
        }
        return d2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long Dx(short[] sArr, HA0<? super Short, C9860tx2> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (short s2 : sArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(Short.valueOf(s2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final float[] Dy(@NotNull Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = fArr[i2].floatValue();
        }
        return fArr2;
    }

    @NotNull
    public static final Set<Float> Dz(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Float> kz = kz(fArr);
        C9444sF.q0(kz, iterable);
        return kz;
    }

    @NotNull
    public static final Iterable<Byte> E5(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return C8222nF.H();
        }
        return new b(bArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M E6(@NotNull float[] fArr, @NotNull M m2, @NotNull HA0<? super Float, ? extends K> ha0, @NotNull HA0<? super Float, ? extends V> ha02) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (float f2 : fArr) {
            m2.put(ha0.invoke(Float.valueOf(f2)), ha02.invoke(Float.valueOf(f2)));
        }
        return m2;
    }

    @XP0
    public static final double E7(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return dArr[0];
    }

    @XP0
    public static final int E8(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public static final List<Short> E9(@NotNull short[] sArr, int i2) {
        C6562gT0.p(sArr, "<this>");
        if (i2 >= 0) {
            return Mx(sArr, C5075aO1.u(sArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, V> List<V> EA(@NotNull int[] iArr, @NotNull R[] rArr, @NotNull VA0<? super Integer, ? super R, ? extends V> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Integer.valueOf(iArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> Ea(@NotNull long[] jArr, @NotNull VA0<? super Integer, ? super Long, Boolean> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j2 = jArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    public static final Short Eb(short[] sArr, HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                return Short.valueOf(s2);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> Ec(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            C9444sF.q0(arrayList, ha0.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    public static final <R> R Ed(@NotNull short[] sArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super Short, ? extends R> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, Short.valueOf(sArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static int Ee(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return jArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Ef(@NotNull long[] jArr, @NotNull M m2, @NotNull HA0<? super Long, ? extends K> ha0, @NotNull HA0<? super Long, ? extends V> ha02) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (long j2 : jArr) {
            K invoke = ha0.invoke(Long.valueOf(j2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Long.valueOf(j2)));
        }
        return m2;
    }

    @XP0
    public static final boolean Eg(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final float Eh(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[Ce(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Ei(@NotNull int[] iArr, @NotNull VA0<? super Integer, ? super Integer, ? extends R> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), Integer.valueOf(iArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Ej(short[] sArr, HA0<? super Short, Double> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            double doubleValue = ha0.invoke(Short.valueOf(sArr[0])).doubleValue();
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Short.valueOf(sArr[i2])).doubleValue());
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Ek(long[] jArr, Comparator<? super R> comparator, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            Object obj = (R) ha0.invoke(Long.valueOf(jArr[0]));
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    R invoke = ha0.invoke(Long.valueOf(jArr[i2]));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte El(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = ze(bArr);
        if (ze == 0) {
            return Byte.valueOf(b2);
        }
        R invoke = ha0.invoke(Byte.valueOf(b2));
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                byte b3 = bArr[i2];
                R invoke2 = ha0.invoke(Byte.valueOf(b3));
                if (invoke.compareTo(invoke2) > 0) {
                    b2 = b3;
                    invoke = invoke2;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Byte.valueOf(b2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Em(boolean[] zArr, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Boolean.valueOf(zArr[0]));
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                R invoke2 = ha0.invoke(Boolean.valueOf(zArr[i2]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float En(@NotNull Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length != 0) {
            float floatValue = fArr[0].floatValue();
            int Fe = Fe(fArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    floatValue = Math.min(floatValue, fArr[i2].floatValue());
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final char[] Eo(char[] cArr, VA0<? super Integer, ? super Character, C7458kA2> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Character.valueOf(cArr[i2]));
            i2++;
            i3++;
        }
        return cArr;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short Ep(@NotNull short[] sArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[abstractC10696xN1.m(sArr.length)]);
    }

    public static final <S, T extends S> S Eq(@NotNull T[] tArr, @NotNull XA0<? super Integer, ? super T, ? super S, ? extends S> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Fe = Fe(tArr);
        if (Fe >= 0) {
            Object obj = (S) tArr[Fe];
            for (int i2 = Fe - 1; i2 >= 0; i2--) {
                obj = (S) xa0.P(Integer.valueOf(i2), (Object) tArr[i2], obj);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final float[] Er(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int Ce = Ce(fArr);
        if (Ce >= 0) {
            int i2 = 0;
            while (true) {
                fArr2[Ce - i2] = fArr[i2];
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return fArr2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Es(char[] cArr, R r2, XA0<? super Integer, ? super R, ? super Character, ? extends R> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (cArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r2);
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Character.valueOf(cArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Double Et(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Double d2 = null;
        boolean z = false;
        for (double d3 : dArr) {
            if (ha0.invoke(Double.valueOf(d3)).booleanValue()) {
                if (z) {
                    return null;
                }
                d2 = Double.valueOf(d3);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return d2;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Eu(@NotNull char[] cArr, int i2, int i3) {
        C6562gT0.p(cArr, "<this>");
        C4788Ye.J3(cArr, i2, i3);
        dr(cArr, i2, i3);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> Ev(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Vv(jArr, new C11156zH.c(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double Ew(@NotNull short[] sArr, @NotNull HA0<? super Short, Double> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (short s2 : sArr) {
            d2 += ha0.invoke(Short.valueOf(s2)).doubleValue();
        }
        return d2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long Ex(boolean[] zArr, HA0<? super Boolean, C9860tx2> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (boolean z : zArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(Boolean.valueOf(z)).p0());
        }
        return n2;
    }

    @NotNull
    public static final HashSet<Byte> Ey(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return (HashSet) ty(bArr, new HashSet(C8683p81.j(bArr.length)));
    }

    @NotNull
    public static final Set<Integer> Ez(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Integer> lz = lz(iArr);
        C9444sF.q0(lz, iterable);
        return lz;
    }

    @NotNull
    public static final Iterable<Character> F5(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return C8222nF.H();
        }
        return new i(cArr);
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Integer>> M F6(@NotNull int[] iArr, @NotNull M m2, @NotNull HA0<? super Integer, ? extends K> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (int i2 : iArr) {
            m2.put(ha0.invoke(Integer.valueOf(i2)), Integer.valueOf(i2));
        }
        return m2;
    }

    @XP0
    public static final float F7(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return fArr[0];
    }

    public static final int F8(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final List<Boolean> F9(@NotNull boolean[] zArr, int i2) {
        C6562gT0.p(zArr, "<this>");
        if (i2 >= 0) {
            return Nx(zArr, C5075aO1.u(zArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<C4180Rx1<Long, R>> FA(@NotNull long[] jArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(Long.valueOf(jArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> Fa(@NotNull T[] tArr, @NotNull VA0<? super Integer, ? super T, Boolean> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), t).booleanValue()) {
                arrayList.add(t);
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    public static final Boolean Fb(boolean[] zArr, HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            boolean z = zArr[length];
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @NotNull
    public static final <R> List<R> Fc(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            C9444sF.q0(arrayList, ha0.invoke(Long.valueOf(j2)));
        }
        return arrayList;
    }

    public static final <R> R Fd(@NotNull boolean[] zArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super Boolean, ? extends R> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, Boolean.valueOf(zArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static <T> int Fe(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return tArr.length - 1;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M Ff(@NotNull T[] tArr, @NotNull M m2, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (T t : tArr) {
            K invoke = ha0.invoke(t);
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(t);
        }
        return m2;
    }

    @XP0
    public static final boolean Fg(byte[] bArr) {
        boolean z;
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final float Fh(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                float f2 = fArr[length];
                if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                    return f2;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Fi(@NotNull long[] jArr, @NotNull VA0<? super Integer, ? super Long, ? extends R> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), Long.valueOf(jArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Fj(boolean[] zArr, HA0<? super Boolean, Double> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            double doubleValue = ha0.invoke(Boolean.valueOf(zArr[0])).doubleValue();
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Boolean.valueOf(zArr[i2])).doubleValue());
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R Fk(T[] tArr, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            Object obj = (R) ha0.invoke(tArr[0]);
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    R invoke = ha0.invoke(tArr[i2]);
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character Fl(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = Ae(cArr);
        if (Ae == 0) {
            return Character.valueOf(c2);
        }
        R invoke = ha0.invoke(Character.valueOf(c2));
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                char c3 = cArr[i2];
                R invoke2 = ha0.invoke(Character.valueOf(c3));
                if (invoke.compareTo(invoke2) > 0) {
                    c2 = c3;
                    invoke = invoke2;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Character.valueOf(c2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double Fm(byte[] bArr, HA0<? super Byte, Double> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Byte.valueOf(bArr[i2])).doubleValue());
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final int Fn(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int De = De(iArr);
            int i3 = 1;
            if (1 <= De) {
                while (true) {
                    int i4 = iArr[i3];
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    if (i3 == De) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final double[] Fo(double[] dArr, VA0<? super Integer, ? super Double, C7458kA2> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Double.valueOf(dArr[i2]));
            i2++;
            i3++;
        }
        return dArr;
    }

    public static final byte Fp(@NotNull byte[] bArr, @NotNull VA0<? super Byte, ? super Byte, Byte> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (bArr.length != 0) {
            byte b2 = bArr[0];
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    b2 = va0.i(Byte.valueOf(b2), Byte.valueOf(bArr[i2])).byteValue();
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return b2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short Fq(@NotNull short[] sArr, @NotNull XA0<? super Integer, ? super Short, ? super Short, Short> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Ge = Ge(sArr);
        if (Ge >= 0) {
            short s2 = sArr[Ge];
            for (int i2 = Ge - 1; i2 >= 0; i2--) {
                s2 = xa0.P(Integer.valueOf(i2), Short.valueOf(sArr[i2]), Short.valueOf(s2)).shortValue();
            }
            return s2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static int[] Fr(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int De = De(iArr);
        if (De >= 0) {
            int i2 = 0;
            while (true) {
                iArr2[De - i2] = iArr[i2];
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return iArr2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Fs(double[] dArr, R r2, XA0<? super Integer, ? super R, ? super Double, ? extends R> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (dArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r2);
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Double.valueOf(dArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Float Ft(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final void Fu(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length > 1) {
            C4788Ye.K3(dArr);
            er(dArr);
        }
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> Fv(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Wv(tArr, new C11156zH.c(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double Fw(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Double> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (boolean z : zArr) {
            d2 += ha0.invoke(Boolean.valueOf(z)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Byte> Fx(@NotNull byte[] bArr, int i2) {
        C6562gT0.p(bArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= bArr.length) {
                return Oy(bArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (byte b2 : bArr) {
                arrayList.add(Byte.valueOf(b2));
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final HashSet<Character> Fy(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return (HashSet) uy(cArr, new HashSet(C8683p81.j(C5075aO1.B(cArr.length, 128))));
    }

    @NotNull
    public static final Set<Long> Fz(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Long> mz = mz(jArr);
        C9444sF.q0(mz, iterable);
        return mz;
    }

    @NotNull
    public static final Iterable<Double> G5(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return C8222nF.H();
        }
        return new g(dArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M G6(@NotNull int[] iArr, @NotNull M m2, @NotNull HA0<? super Integer, ? extends K> ha0, @NotNull HA0<? super Integer, ? extends V> ha02) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (int i2 : iArr) {
            m2.put(ha0.invoke(Integer.valueOf(i2)), ha02.invoke(Integer.valueOf(i2)));
        }
        return m2;
    }

    @XP0
    public static final int G7(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return iArr[0];
    }

    @XP0
    public static final int G8(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return cArr.length;
    }

    @NotNull
    public static final List<Byte> G9(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int ze = ze(bArr); -1 < ze; ze--) {
            if (!ha0.invoke(Byte.valueOf(bArr[ze])).booleanValue()) {
                return Fx(bArr, ze + 1);
            }
        }
        return C8222nF.H();
    }

    @NotNull
    public static final <R, V> List<V> GA(@NotNull long[] jArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super Long, ? super R, ? extends V> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(Long.valueOf(jArr[i2]), obj));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> Ga(@NotNull short[] sArr, @NotNull VA0<? super Integer, ? super Short, Boolean> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s2 = sArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    public static final Byte Gb(byte[] bArr, HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            byte b2 = bArr[length];
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @NotNull
    public static final <T, R> List<R> Gc(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            C9444sF.q0(arrayList, ha0.invoke(t));
        }
        return arrayList;
    }

    public static final <R> R Gd(@NotNull byte[] bArr, R r2, @NotNull VA0<? super Byte, ? super R, ? extends R> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int ze = ze(bArr); ze >= 0; ze--) {
            r2 = va0.i(Byte.valueOf(bArr[ze]), r2);
        }
        return r2;
    }

    public static int Ge(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return sArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M Gf(@NotNull T[] tArr, @NotNull M m2, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (T t : tArr) {
            K invoke = ha0.invoke(t);
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(t));
        }
        return m2;
    }

    @XP0
    public static final boolean Gg(char[] cArr) {
        boolean z;
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static int Gh(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[De(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <T, R> List<R> Gi(@NotNull T[] tArr, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float Gj(byte[] bArr, HA0<? super Byte, Float> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            float floatValue = ha0.invoke(Byte.valueOf(bArr[0])).floatValue();
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Byte.valueOf(bArr[i2])).floatValue());
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Gk(short[] sArr, Comparator<? super R> comparator, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            Object obj = (R) ha0.invoke(Short.valueOf(sArr[0]));
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    R invoke = ha0.invoke(Short.valueOf(sArr[i2]));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double Gl(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = Be(dArr);
        if (Be == 0) {
            return Double.valueOf(d2);
        }
        R invoke = ha0.invoke(Double.valueOf(d2));
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                double d3 = dArr[i2];
                R invoke2 = ha0.invoke(Double.valueOf(d3));
                if (invoke.compareTo(invoke2) > 0) {
                    d2 = d3;
                    invoke = invoke2;
                }
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(d2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double Gm(char[] cArr, HA0<? super Character, Double> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Character.valueOf(cArr[0])).doubleValue();
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Character.valueOf(cArr[i2])).doubleValue());
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final long Gn(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length != 0) {
            long j2 = jArr[0];
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    long j3 = jArr[i2];
                    if (j2 > j3) {
                        j2 = j3;
                    }
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return j2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final float[] Go(float[] fArr, VA0<? super Integer, ? super Float, C7458kA2> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Float.valueOf(fArr[i2]));
            i2++;
            i3++;
        }
        return fArr;
    }

    public static final char Gp(@NotNull char[] cArr, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (cArr.length != 0) {
            char c2 = cArr[0];
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    c2 = va0.i(Character.valueOf(c2), Character.valueOf(cArr[i2])).charValue();
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return c2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean Gq(@NotNull boolean[] zArr, @NotNull XA0<? super Integer, ? super Boolean, ? super Boolean, Boolean> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int He = He(zArr);
        if (He >= 0) {
            boolean z = zArr[He];
            for (int i2 = He - 1; i2 >= 0; i2--) {
                z = xa0.P(Integer.valueOf(i2), Boolean.valueOf(zArr[i2]), Boolean.valueOf(z)).booleanValue();
            }
            return z;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static long[] Gr(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int Ee = Ee(jArr);
        if (Ee >= 0) {
            int i2 = 0;
            while (true) {
                jArr2[Ee - i2] = jArr[i2];
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return jArr2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Gs(float[] fArr, R r2, XA0<? super Integer, ? super R, ? super Float, ? extends R> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (fArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r2);
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Float.valueOf(fArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Float Gt(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Float f2 = null;
        boolean z = false;
        for (float f3 : fArr) {
            if (ha0.invoke(Float.valueOf(f3)).booleanValue()) {
                if (z) {
                    return null;
                }
                f2 = Float.valueOf(f3);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return f2;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Gu(@NotNull double[] dArr, int i2, int i3) {
        C6562gT0.p(dArr, "<this>");
        C4788Ye.L3(dArr, i2, i3);
        fr(dArr, i2, i3);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> Gv(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Xv(sArr, new C11156zH.c(ha0));
    }

    @InterfaceC8046mW0(name = "sumOfByte")
    public static final int Gw(@NotNull Byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        int i2 = 0;
        for (Byte b2 : bArr) {
            i2 += b2.byteValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Character> Gx(@NotNull char[] cArr, int i2) {
        C6562gT0.p(cArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= cArr.length) {
                return Py(cArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Character.valueOf(cArr[0]));
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (char c2 : cArr) {
                arrayList.add(Character.valueOf(c2));
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final HashSet<Double> Gy(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return (HashSet) vy(dArr, new HashSet(C8683p81.j(dArr.length)));
    }

    @NotNull
    public static final <T> Set<T> Gz(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<T> nz = nz(tArr);
        C9444sF.q0(nz, iterable);
        return nz;
    }

    @NotNull
    public static final Iterable<Float> H5(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return C8222nF.H();
        }
        return new f(fArr);
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Long>> M H6(@NotNull long[] jArr, @NotNull M m2, @NotNull HA0<? super Long, ? extends K> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (long j2 : jArr) {
            m2.put(ha0.invoke(Long.valueOf(j2)), Long.valueOf(j2));
        }
        return m2;
    }

    @XP0
    public static final long H7(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return jArr[0];
    }

    public static final int H8(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final List<Character> H9(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Ae = Ae(cArr); -1 < Ae; Ae--) {
            if (!ha0.invoke(Character.valueOf(cArr[Ae])).booleanValue()) {
                return Gx(cArr, Ae + 1);
            }
        }
        return C8222nF.H();
    }

    @NotNull
    public static final List<C4180Rx1<Long, Long>> HA(@NotNull long[] jArr, @NotNull long[] jArr2) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(jArr2, "other");
        int min = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(Long.valueOf(jArr[i2]), Long.valueOf(jArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> Ha(@NotNull boolean[] zArr, @NotNull VA0<? super Integer, ? super Boolean, Boolean> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    public static final Character Hb(char[] cArr, HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            char c2 = cArr[length];
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @NotNull
    public static final <R> List<R> Hc(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            C9444sF.q0(arrayList, ha0.invoke(Short.valueOf(s2)));
        }
        return arrayList;
    }

    public static final <R> R Hd(@NotNull char[] cArr, R r2, @NotNull VA0<? super Character, ? super R, ? extends R> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int Ae = Ae(cArr); Ae >= 0; Ae--) {
            r2 = va0.i(Character.valueOf(cArr[Ae]), r2);
        }
        return r2;
    }

    public static final int He(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return zArr.length - 1;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Short>>> M Hf(@NotNull short[] sArr, @NotNull M m2, @NotNull HA0<? super Short, ? extends K> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (short s2 : sArr) {
            K invoke = ha0.invoke(Short.valueOf(s2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(Short.valueOf(s2));
        }
        return m2;
    }

    @XP0
    public static final boolean Hg(double[] dArr) {
        boolean z;
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final int Hh(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                int i3 = iArr[length];
                if (ha0.invoke(Integer.valueOf(i3)).booleanValue()) {
                    return i3;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> Hi(@NotNull short[] sArr, @NotNull VA0<? super Integer, ? super Short, ? extends R> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), Short.valueOf(sArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float Hj(char[] cArr, HA0<? super Character, Float> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            float floatValue = ha0.invoke(Character.valueOf(cArr[0])).floatValue();
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Character.valueOf(cArr[i2])).floatValue());
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Hk(boolean[] zArr, Comparator<? super R> comparator, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            Object obj = (R) ha0.invoke(Boolean.valueOf(zArr[0]));
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    R invoke = ha0.invoke(Boolean.valueOf(zArr[i2]));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float Hl(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = Ce(fArr);
        if (Ce == 0) {
            return Float.valueOf(f2);
        }
        R invoke = ha0.invoke(Float.valueOf(f2));
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                float f3 = fArr[i2];
                R invoke2 = ha0.invoke(Float.valueOf(f3));
                if (invoke.compareTo(invoke2) > 0) {
                    f2 = f3;
                    invoke = invoke2;
                }
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double Hm(double[] dArr, HA0<? super Double, Double> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Double.valueOf(dArr[0])).doubleValue();
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Double.valueOf(dArr[i2])).doubleValue());
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T Hn(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length != 0) {
            T t = tArr[0];
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    T t2 = tArr[i2];
                    if (t.compareTo(t2) > 0) {
                        t = t2;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int[] Ho(int[] iArr, VA0<? super Integer, ? super Integer, C7458kA2> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Integer.valueOf(iArr[i2]));
            i2++;
            i3++;
        }
        return iArr;
    }

    public static final double Hp(@NotNull double[] dArr, @NotNull VA0<? super Double, ? super Double, Double> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    d2 = va0.i(Double.valueOf(d2), Double.valueOf(dArr[i2])).doubleValue();
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return d2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Boolean Hq(@NotNull boolean[] zArr, @NotNull XA0<? super Integer, ? super Boolean, ? super Boolean, Boolean> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int He = He(zArr);
        if (He < 0) {
            return null;
        }
        boolean z = zArr[He];
        for (int i2 = He - 1; i2 >= 0; i2--) {
            z = xa0.P(Integer.valueOf(i2), Boolean.valueOf(zArr[i2]), Boolean.valueOf(z)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @NotNull
    public static final <T> T[] Hr(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) C4594We.a(tArr, tArr.length);
        int Fe = Fe(tArr);
        if (Fe >= 0) {
            int i2 = 0;
            while (true) {
                tArr2[Fe - i2] = tArr[i2];
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return tArr2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Hs(int[] iArr, R r2, XA0<? super Integer, ? super R, ? super Integer, ? extends R> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (iArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r2);
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Integer.valueOf(iArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Integer Ht(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static final void Hu(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length > 1) {
            C4788Ye.M3(fArr);
            gr(fArr);
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> Hv(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Yv(zArr, new C11156zH.c(ha0));
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Hw(byte[] bArr, HA0<? super Byte, Double> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (byte b2 : bArr) {
            d2 += ha0.invoke(Byte.valueOf(b2)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Double> Hx(@NotNull double[] dArr, int i2) {
        C6562gT0.p(dArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= dArr.length) {
                return Qy(dArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Double.valueOf(dArr[0]));
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (double d2 : dArr) {
                arrayList.add(Double.valueOf(d2));
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final HashSet<Float> Hy(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return (HashSet) wy(fArr, new HashSet(C8683p81.j(fArr.length)));
    }

    @NotNull
    public static final Set<Short> Hz(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Short> oz = oz(sArr);
        C9444sF.q0(oz, iterable);
        return oz;
    }

    @NotNull
    public static final Iterable<Integer> I5(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return C8222nF.H();
        }
        return new d(iArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M I6(@NotNull long[] jArr, @NotNull M m2, @NotNull HA0<? super Long, ? extends K> ha0, @NotNull HA0<? super Long, ? extends V> ha02) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (long j2 : jArr) {
            m2.put(ha0.invoke(Long.valueOf(j2)), ha02.invoke(Long.valueOf(j2)));
        }
        return m2;
    }

    @XP0
    public static final <T> T I7(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return tArr[0];
    }

    @XP0
    public static final int I8(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return dArr.length;
    }

    @NotNull
    public static final List<Double> I9(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Be = Be(dArr); -1 < Be; Be--) {
            if (!ha0.invoke(Double.valueOf(dArr[Be])).booleanValue()) {
                return Hx(dArr, Be + 1);
            }
        }
        return C8222nF.H();
    }

    @NotNull
    public static final <V> List<V> IA(@NotNull long[] jArr, @NotNull long[] jArr2, @NotNull VA0<? super Long, ? super Long, ? extends V> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(jArr2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Long.valueOf(jArr[i2]), Long.valueOf(jArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C Ia(@NotNull byte[] bArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Byte, Boolean> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Byte.valueOf(b2)).booleanValue()) {
                c2.add(Byte.valueOf(b2));
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    @XP0
    public static final Double Ib(double[] dArr, HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            double d2 = dArr[length];
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @NotNull
    public static final <R> List<R> Ic(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            C9444sF.q0(arrayList, ha0.invoke(Boolean.valueOf(z)));
        }
        return arrayList;
    }

    public static final <R> R Id(@NotNull double[] dArr, R r2, @NotNull VA0<? super Double, ? super R, ? extends R> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int Be = Be(dArr); Be >= 0; Be--) {
            r2 = va0.i(Double.valueOf(dArr[Be]), r2);
        }
        return r2;
    }

    @XP0
    public static final byte Ie(byte[] bArr, int i2, HA0<? super Integer, Byte> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < bArr.length) {
            return bArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).byteValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M If(@NotNull short[] sArr, @NotNull M m2, @NotNull HA0<? super Short, ? extends K> ha0, @NotNull HA0<? super Short, ? extends V> ha02) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (short s2 : sArr) {
            K invoke = ha0.invoke(Short.valueOf(s2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Short.valueOf(s2)));
        }
        return m2;
    }

    @XP0
    public static final boolean Ig(float[] fArr) {
        boolean z;
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static long Ih(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[Ee(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> Ii(@NotNull boolean[] zArr, @NotNull VA0<? super Integer, ? super Boolean, ? extends R> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(va0.i(Integer.valueOf(i3), Boolean.valueOf(zArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float Ij(double[] dArr, HA0<? super Double, Float> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            float floatValue = ha0.invoke(Double.valueOf(dArr[0])).floatValue();
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Double.valueOf(dArr[i2])).floatValue());
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Ik(byte[] bArr, Comparator<? super R> comparator, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Byte.valueOf(bArr[0]));
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                R invoke = ha0.invoke(Byte.valueOf(bArr[i2]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer Il(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int De = De(iArr);
        if (De == 0) {
            return Integer.valueOf(i2);
        }
        R invoke = ha0.invoke(Integer.valueOf(i2));
        int i3 = 1;
        if (1 <= De) {
            while (true) {
                int i4 = iArr[i3];
                R invoke2 = ha0.invoke(Integer.valueOf(i4));
                if (invoke.compareTo(invoke2) > 0) {
                    i2 = i4;
                    invoke = invoke2;
                }
                if (i3 == De) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double Im(float[] fArr, HA0<? super Float, Double> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Float.valueOf(fArr[0])).doubleValue();
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Float.valueOf(fArr[i2])).doubleValue());
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final short In(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length != 0) {
            short s2 = sArr[0];
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    short s3 = sArr[i2];
                    if (s2 > s3) {
                        s2 = s3;
                    }
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return s2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final long[] Io(long[] jArr, VA0<? super Integer, ? super Long, C7458kA2> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Long.valueOf(jArr[i2]));
            i2++;
            i3++;
        }
        return jArr;
    }

    public static final float Ip(@NotNull float[] fArr, @NotNull VA0<? super Float, ? super Float, Float> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (fArr.length != 0) {
            float f2 = fArr[0];
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    f2 = va0.i(Float.valueOf(f2), Float.valueOf(fArr[i2])).floatValue();
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return f2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte Iq(@NotNull byte[] bArr, @NotNull XA0<? super Integer, ? super Byte, ? super Byte, Byte> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int ze = ze(bArr);
        if (ze < 0) {
            return null;
        }
        byte b2 = bArr[ze];
        for (int i2 = ze - 1; i2 >= 0; i2--) {
            b2 = xa0.P(Integer.valueOf(i2), Byte.valueOf(bArr[i2]), Byte.valueOf(b2)).byteValue();
        }
        return Byte.valueOf(b2);
    }

    @NotNull
    public static short[] Ir(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int Ge = Ge(sArr);
        if (Ge >= 0) {
            int i2 = 0;
            while (true) {
                sArr2[Ge - i2] = sArr[i2];
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return sArr2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Is(long[] jArr, R r2, XA0<? super Integer, ? super R, ? super Long, ? extends R> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (jArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r2);
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Long.valueOf(jArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Integer It(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Integer num = null;
        boolean z = false;
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                if (z) {
                    return null;
                }
                num = Integer.valueOf(i2);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return num;
    }

    @InterfaceC6480g82(version = "1.4")
    public static void Iu(@NotNull float[] fArr, int i2, int i3) {
        C6562gT0.p(fArr, "<this>");
        C4788Ye.N3(fArr, i2, i3);
        hr(fArr, i2, i3);
    }

    @NotNull
    public static final List<Byte> Iv(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.G3(copyOf);
        return sr(copyOf);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Iw(char[] cArr, HA0<? super Character, Double> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (char c2 : cArr) {
            d2 += ha0.invoke(Character.valueOf(c2)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Float> Ix(@NotNull float[] fArr, int i2) {
        C6562gT0.p(fArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= fArr.length) {
                return Ry(fArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (float f2 : fArr) {
                arrayList.add(Float.valueOf(f2));
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final HashSet<Integer> Iy(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return (HashSet) xy(iArr, new HashSet(C8683p81.j(iArr.length)));
    }

    @NotNull
    public static final Set<Boolean> Iz(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Boolean> pz = pz(zArr);
        C9444sF.q0(pz, iterable);
        return pz;
    }

    @NotNull
    public static final Iterable<Long> J5(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return C8222nF.H();
        }
        return new e(jArr);
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M J6(@NotNull T[] tArr, @NotNull M m2, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (T t : tArr) {
            m2.put(ha0.invoke(t), t);
        }
        return m2;
    }

    @XP0
    public static final short J7(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return sArr[0];
    }

    public static final int J8(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final List<Float> J9(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Ce = Ce(fArr); -1 < Ce; Ce--) {
            if (!ha0.invoke(Float.valueOf(fArr[Ce])).booleanValue()) {
                return Ix(fArr, Ce + 1);
            }
        }
        return C8222nF.H();
    }

    @NotNull
    public static final <R> List<C4180Rx1<Long, R>> JA(@NotNull long[] jArr, @NotNull R[] rArr) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            long j2 = jArr[i2];
            arrayList.add(C6670gv2.a(Long.valueOf(j2), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C Ja(@NotNull char[] cArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Character, Boolean> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Character.valueOf(c3)).booleanValue()) {
                c2.add(Character.valueOf(c3));
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    @XP0
    public static final Float Jb(float[] fArr, HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            float f2 = fArr[length];
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Jc(byte[] bArr, VA0<? super Integer, ? super Byte, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), Byte.valueOf(bArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> R Jd(@NotNull float[] fArr, R r2, @NotNull VA0<? super Float, ? super R, ? extends R> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int Ce = Ce(fArr); Ce >= 0; Ce--) {
            r2 = va0.i(Float.valueOf(fArr[Ce]), r2);
        }
        return r2;
    }

    @XP0
    public static final char Je(char[] cArr, int i2, HA0<? super Integer, Character> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < cArr.length) {
            return cArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).charValue();
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Boolean>>> M Jf(@NotNull boolean[] zArr, @NotNull M m2, @NotNull HA0<? super Boolean, ? extends K> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (boolean z : zArr) {
            K invoke = ha0.invoke(Boolean.valueOf(z));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(Boolean.valueOf(z));
        }
        return m2;
    }

    @XP0
    public static final boolean Jg(int[] iArr) {
        boolean z;
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final long Jh(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                long j2 = jArr[length];
                if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                    return j2;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <T, R> List<R> Ji(@NotNull T[] tArr, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            R i5 = va0.i(Integer.valueOf(i3), tArr[i2]);
            if (i5 != null) {
                arrayList.add(i5);
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float Jj(float[] fArr, HA0<? super Float, Float> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            float floatValue = ha0.invoke(Float.valueOf(fArr[0])).floatValue();
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Float.valueOf(fArr[i2])).floatValue());
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Jk(char[] cArr, Comparator<? super R> comparator, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Character.valueOf(cArr[0]));
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                R invoke = ha0.invoke(Character.valueOf(cArr[i2]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long Jl(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int Ee = Ee(jArr);
        if (Ee == 0) {
            return Long.valueOf(j2);
        }
        R invoke = ha0.invoke(Long.valueOf(j2));
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                long j3 = jArr[i2];
                R invoke2 = ha0.invoke(Long.valueOf(j3));
                if (invoke.compareTo(invoke2) > 0) {
                    j2 = j3;
                    invoke = invoke2;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Long.valueOf(j2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double Jm(int[] iArr, HA0<? super Integer, Double> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int De = De(iArr);
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Integer.valueOf(iArr[i2])).doubleValue());
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Boolean Jn(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                boolean z2 = zArr[i2];
                if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) > 0) {
                    z = z2;
                }
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <T> T[] Jo(T[] tArr, VA0<? super Integer, ? super T, C7458kA2> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), tArr[i2]);
            i2++;
            i3++;
        }
        return tArr;
    }

    public static final int Jp(@NotNull int[] iArr, @NotNull VA0<? super Integer, ? super Integer, Integer> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int De = De(iArr);
            int i3 = 1;
            if (1 <= De) {
                while (true) {
                    i2 = va0.i(Integer.valueOf(i2), Integer.valueOf(iArr[i3])).intValue();
                    if (i3 == De) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character Jq(@NotNull char[] cArr, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Ae = Ae(cArr);
        if (Ae < 0) {
            return null;
        }
        char c2 = cArr[Ae];
        for (int i2 = Ae - 1; i2 >= 0; i2--) {
            c2 = xa0.P(Integer.valueOf(i2), Character.valueOf(cArr[i2]), Character.valueOf(c2)).charValue();
        }
        return Character.valueOf(c2);
    }

    @NotNull
    public static final boolean[] Jr(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int He = He(zArr);
        if (He >= 0) {
            int i2 = 0;
            while (true) {
                zArr2[He - i2] = zArr[i2];
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> List<R> Js(@NotNull T[] tArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (tArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r2);
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, tArr[i2]);
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Long Jt(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final void Ju(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length > 1) {
            C4788Ye.O3(iArr);
            ir(iArr);
        }
    }

    @NotNull
    public static final List<Character> Jv(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.I3(copyOf);
        return tr(copyOf);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Jw(double[] dArr, HA0<? super Double, Double> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += ha0.invoke(Double.valueOf(d3)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Integer> Jx(@NotNull int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= iArr.length) {
                return Sy(iArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (int i4 : iArr) {
                arrayList.add(Integer.valueOf(i4));
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final HashSet<Long> Jy(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return (HashSet) yy(jArr, new HashSet(C8683p81.j(jArr.length)));
    }

    @NotNull
    public static final Iterable<C9485sP0<Byte>> Jz(@NotNull final byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.ef
            @Override // o.FA0
            public final Object invoke() {
                Iterator Tz;
                Tz = C7330jf.Tz(bArr);
                return Tz;
            }
        });
    }

    @NotNull
    public static <T> Iterable<T> K5(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return C8222nF.H();
        }
        return new a(tArr);
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M K6(@NotNull T[] tArr, @NotNull M m2, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (T t : tArr) {
            m2.put(ha0.invoke(t), ha02.invoke(t));
        }
        return m2;
    }

    @XP0
    public static final boolean K7(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return zArr[0];
    }

    @XP0
    public static final int K8(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return fArr.length;
    }

    @NotNull
    public static final List<Integer> K9(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int De = De(iArr); -1 < De; De--) {
            if (!ha0.invoke(Integer.valueOf(iArr[De])).booleanValue()) {
                return Jx(iArr, De + 1);
            }
        }
        return C8222nF.H();
    }

    @NotNull
    public static final <R, V> List<V> KA(@NotNull long[] jArr, @NotNull R[] rArr, @NotNull VA0<? super Long, ? super R, ? extends V> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Long.valueOf(jArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C Ka(@NotNull double[] dArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Double, Boolean> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Double.valueOf(d2)).booleanValue()) {
                c2.add(Double.valueOf(d2));
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    @XP0
    public static final Integer Kb(int[] iArr, HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            int i3 = iArr[length];
            if (ha0.invoke(Integer.valueOf(i3)).booleanValue()) {
                return Integer.valueOf(i3);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Kc(char[] cArr, VA0<? super Integer, ? super Character, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), Character.valueOf(cArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> R Kd(@NotNull int[] iArr, R r2, @NotNull VA0<? super Integer, ? super R, ? extends R> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int De = De(iArr); De >= 0; De--) {
            r2 = va0.i(Integer.valueOf(iArr[De]), r2);
        }
        return r2;
    }

    @XP0
    public static final double Ke(double[] dArr, int i2, HA0<? super Integer, Double> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < dArr.length) {
            return dArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M Kf(@NotNull boolean[] zArr, @NotNull M m2, @NotNull HA0<? super Boolean, ? extends K> ha0, @NotNull HA0<? super Boolean, ? extends V> ha02) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (boolean z : zArr) {
            K invoke = ha0.invoke(Boolean.valueOf(z));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Boolean.valueOf(z)));
        }
        return m2;
    }

    @XP0
    public static final boolean Kg(long[] jArr) {
        boolean z;
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final <T> T Kh(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[Fe(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C Ki(@NotNull T[] tArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            R i5 = va0.i(Integer.valueOf(i3), tArr[i2]);
            if (i5 != null) {
                c2.add(i5);
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float Kj(int[] iArr, HA0<? super Integer, Float> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            float floatValue = ha0.invoke(Integer.valueOf(iArr[0])).floatValue();
            int De = De(iArr);
            int i2 = 1;
            if (1 <= De) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Integer.valueOf(iArr[i2])).floatValue());
                    if (i2 == De) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Kk(double[] dArr, Comparator<? super R> comparator, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Double.valueOf(dArr[0]));
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                R invoke = ha0.invoke(Double.valueOf(dArr[i2]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T Kl(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int Fe = Fe(tArr);
        if (Fe != 0) {
            R invoke = ha0.invoke(t);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    T t2 = tArr[i2];
                    R invoke2 = ha0.invoke(t2);
                    if (invoke.compareTo(invoke2) > 0) {
                        t = t2;
                        invoke = invoke2;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return t;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double Km(long[] jArr, HA0<? super Long, Double> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Long.valueOf(jArr[0])).doubleValue();
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Long.valueOf(jArr[i2])).doubleValue());
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte Kn(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                byte b3 = bArr[i2];
                if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) > 0) {
                    b2 = b3;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Byte.valueOf(b2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final short[] Ko(short[] sArr, VA0<? super Integer, ? super Short, C7458kA2> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Short.valueOf(sArr[i2]));
            i2++;
            i3++;
        }
        return sArr;
    }

    public static final long Kp(@NotNull long[] jArr, @NotNull VA0<? super Long, ? super Long, Long> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (jArr.length != 0) {
            long j2 = jArr[0];
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    j2 = va0.i(Long.valueOf(j2), Long.valueOf(jArr[i2])).longValue();
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return j2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double Kq(@NotNull double[] dArr, @NotNull XA0<? super Integer, ? super Double, ? super Double, Double> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Be = Be(dArr);
        if (Be < 0) {
            return null;
        }
        double d2 = dArr[Be];
        for (int i2 = Be - 1; i2 >= 0; i2--) {
            d2 = xa0.P(Integer.valueOf(i2), Double.valueOf(dArr[i2]), Double.valueOf(d2)).doubleValue();
        }
        return Double.valueOf(d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Kr(byte[] bArr, R r2, VA0<? super R, ? super Byte, ? extends R> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (bArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r2);
        for (byte b2 : bArr) {
            r2 = va0.i(r2, Byte.valueOf(b2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Ks(short[] sArr, R r2, XA0<? super Integer, ? super R, ? super Short, ? extends R> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (sArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r2);
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Short.valueOf(sArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Long Kt(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Long l2 = null;
        boolean z = false;
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                if (z) {
                    return null;
                }
                l2 = Long.valueOf(j2);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return l2;
    }

    @InterfaceC6480g82(version = "1.4")
    public static void Ku(@NotNull int[] iArr, int i2, int i3) {
        C6562gT0.p(iArr, "<this>");
        C4788Ye.P3(iArr, i2, i3);
        jr(iArr, i2, i3);
    }

    @NotNull
    public static final List<Double> Kv(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.K3(copyOf);
        return ur(copyOf);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Kw(float[] fArr, HA0<? super Float, Double> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (float f2 : fArr) {
            d2 += ha0.invoke(Float.valueOf(f2)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Long> Kx(@NotNull long[] jArr, int i2) {
        C6562gT0.p(jArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= jArr.length) {
                return Ty(jArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Long.valueOf(jArr[0]));
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (long j2 : jArr) {
                arrayList.add(Long.valueOf(j2));
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static <T> HashSet<T> Ky(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return (HashSet) zy(tArr, new HashSet(C8683p81.j(tArr.length)));
    }

    @NotNull
    public static final Iterable<C9485sP0<Character>> Kz(@NotNull final char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.Ze
            @Override // o.FA0
            public final Object invoke() {
                Iterator aA;
                aA = C7330jf.aA(cArr);
                return aA;
            }
        });
    }

    @NotNull
    public static final Iterable<Short> L5(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return C8222nF.H();
        }
        return new c(sArr);
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Short>> M L6(@NotNull short[] sArr, @NotNull M m2, @NotNull HA0<? super Short, ? extends K> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (short s2 : sArr) {
            m2.put(ha0.invoke(Short.valueOf(s2)), Short.valueOf(s2));
        }
        return m2;
    }

    @XP0
    public static final byte L7(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return bArr[1];
    }

    public static final int L8(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final List<Long> L9(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Ee = Ee(jArr); -1 < Ee; Ee--) {
            if (!ha0.invoke(Long.valueOf(jArr[Ee])).booleanValue()) {
                return Kx(jArr, Ee + 1);
            }
        }
        return C8222nF.H();
    }

    @NotNull
    public static final <T, R> List<C4180Rx1<T, R>> LA(@NotNull T[] tArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(tArr[i2], r2));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C La(@NotNull float[] fArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Float, Boolean> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Float.valueOf(f2)).booleanValue()) {
                c2.add(Float.valueOf(f2));
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    @XP0
    public static final Long Lb(long[] jArr, HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            long j2 = jArr[length];
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                return Long.valueOf(j2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Lc(double[] dArr, VA0<? super Integer, ? super Double, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), Double.valueOf(dArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> R Ld(@NotNull long[] jArr, R r2, @NotNull VA0<? super Long, ? super R, ? extends R> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int Ee = Ee(jArr); Ee >= 0; Ee--) {
            r2 = va0.i(Long.valueOf(jArr[Ee]), r2);
        }
        return r2;
    }

    @XP0
    public static final float Le(float[] fArr, int i2, HA0<? super Integer, Float> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < fArr.length) {
            return fArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).floatValue();
    }

    @InterfaceC6480g82(version = "1.1")
    @NotNull
    public static final <T, K> UE0<T, K> Lf(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        return new s(tArr, ha0);
    }

    @XP0
    public static final <T> boolean Lg(T[] tArr) {
        boolean z;
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final <T> T Lh(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                T t = tArr[length];
                if (ha0.invoke(t).booleanValue()) {
                    return t;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Li(@NotNull byte[] bArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Byte, ? extends R> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), Byte.valueOf(bArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float Lj(long[] jArr, HA0<? super Long, Float> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            float floatValue = ha0.invoke(Long.valueOf(jArr[0])).floatValue();
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Long.valueOf(jArr[i2])).floatValue());
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Lk(float[] fArr, Comparator<? super R> comparator, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Float.valueOf(fArr[0]));
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                R invoke = ha0.invoke(Float.valueOf(fArr[i2]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short Ll(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int Ge = Ge(sArr);
        if (Ge == 0) {
            return Short.valueOf(s2);
        }
        R invoke = ha0.invoke(Short.valueOf(s2));
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                short s3 = sArr[i2];
                R invoke2 = ha0.invoke(Short.valueOf(s3));
                if (invoke.compareTo(invoke2) > 0) {
                    s2 = s3;
                    invoke = invoke2;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Short.valueOf(s2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Double Lm(T[] tArr, HA0<? super T, Double> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(tArr[0]).doubleValue();
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(tArr[i2]).doubleValue());
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character Ln(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                char c3 = cArr[i2];
                if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) > 0) {
                    c2 = c3;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Character.valueOf(c2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final boolean[] Lo(boolean[] zArr, VA0<? super Integer, ? super Boolean, C7458kA2> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Boolean.valueOf(zArr[i2]));
            i2++;
            i3++;
        }
        return zArr;
    }

    public static final <S, T extends S> S Lp(@NotNull T[] tArr, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (tArr.length != 0) {
            S s2 = (Object) tArr[0];
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    s2 = va0.i(s2, (Object) tArr[i2]);
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return (S) s2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float Lq(@NotNull float[] fArr, @NotNull XA0<? super Integer, ? super Float, ? super Float, Float> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Ce = Ce(fArr);
        if (Ce < 0) {
            return null;
        }
        float f2 = fArr[Ce];
        for (int i2 = Ce - 1; i2 >= 0; i2--) {
            f2 = xa0.P(Integer.valueOf(i2), Float.valueOf(fArr[i2]), Float.valueOf(f2)).floatValue();
        }
        return Float.valueOf(f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Lr(char[] cArr, R r2, VA0<? super R, ? super Character, ? extends R> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (cArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r2);
        for (char c2 : cArr) {
            r2 = va0.i(r2, Character.valueOf(c2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Ls(boolean[] zArr, R r2, XA0<? super Integer, ? super R, ? super Boolean, ? extends R> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (zArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r2);
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Boolean.valueOf(zArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static <T> T Lt(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final void Lu(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length > 1) {
            C4788Ye.Q3(jArr);
            kr(jArr);
        }
    }

    @NotNull
    public static final List<Float> Lv(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.M3(copyOf);
        return vr(copyOf);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Lw(int[] iArr, HA0<? super Integer, Double> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (int i2 : iArr) {
            d2 += ha0.invoke(Integer.valueOf(i2)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final <T> List<T> Lx(@NotNull T[] tArr, int i2) {
        C6562gT0.p(tArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= tArr.length) {
                return Uy(tArr);
            }
            if (i2 == 1) {
                return C7979mF.k(tArr[0]);
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (T t : tArr) {
                arrayList.add(t);
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final HashSet<Short> Ly(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return (HashSet) Ay(sArr, new HashSet(C8683p81.j(sArr.length)));
    }

    @NotNull
    public static final Iterable<C9485sP0<Double>> Lz(@NotNull final double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.hf
            @Override // o.FA0
            public final Object invoke() {
                Iterator Yz;
                Yz = C7330jf.Yz(dArr);
                return Yz;
            }
        });
    }

    @NotNull
    public static final Iterable<Boolean> M5(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return C8222nF.H();
        }
        return new h(zArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M M6(@NotNull short[] sArr, @NotNull M m2, @NotNull HA0<? super Short, ? extends K> ha0, @NotNull HA0<? super Short, ? extends V> ha02) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (short s2 : sArr) {
            m2.put(ha0.invoke(Short.valueOf(s2)), ha02.invoke(Short.valueOf(s2)));
        }
        return m2;
    }

    @XP0
    public static final char M7(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return cArr[1];
    }

    @XP0
    public static final int M8(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public static final <T> List<T> M9(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Fe = Fe(tArr); -1 < Fe; Fe--) {
            if (!ha0.invoke(tArr[Fe]).booleanValue()) {
                return Lx(tArr, Fe + 1);
            }
        }
        return C8222nF.H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> MA(@NotNull T[] tArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super T, ? super R, ? extends V> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(tArr[i2], obj));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C Ma(@NotNull int[] iArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Integer, Boolean> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            int i5 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Integer.valueOf(i4)).booleanValue()) {
                c2.add(Integer.valueOf(i4));
            }
            i2++;
            i3 = i5;
        }
        return c2;
    }

    @XP0
    public static final <T> T Mb(T[] tArr, HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            T t = tArr[length];
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Mc(float[] fArr, VA0<? super Integer, ? super Float, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), Float.valueOf(fArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Md(@NotNull T[] tArr, R r2, @NotNull VA0<? super T, ? super R, ? extends R> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int Fe = Fe(tArr); Fe >= 0; Fe--) {
            r2 = va0.i(tArr[Fe], r2);
        }
        return r2;
    }

    @XP0
    public static final int Me(int[] iArr, int i2, HA0<? super Integer, Integer> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).intValue();
    }

    public static int Mf(@NotNull byte[] bArr, byte b2) {
        C6562gT0.p(bArr, "<this>");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b2 == bArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @XP0
    public static final boolean Mg(short[] sArr) {
        boolean z;
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static short Mh(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[Ge(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Mi(@NotNull char[] cArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Character, ? extends R> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), Character.valueOf(cArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> float Mj(T[] tArr, HA0<? super T, Float> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            float floatValue = ha0.invoke(tArr[0]).floatValue();
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(tArr[i2]).floatValue());
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Mk(int[] iArr, Comparator<? super R> comparator, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Integer.valueOf(iArr[0]));
        int De = De(iArr);
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                R invoke = ha0.invoke(Integer.valueOf(iArr[i2]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> byte Ml(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            byte b2 = bArr[0];
            int ze = ze(bArr);
            if (ze != 0) {
                R invoke = ha0.invoke(Byte.valueOf(b2));
                int i2 = 1;
                if (1 <= ze) {
                    while (true) {
                        byte b3 = bArr[i2];
                        R invoke2 = ha0.invoke(Byte.valueOf(b3));
                        if (invoke.compareTo(invoke2) > 0) {
                            b2 = b3;
                            invoke = invoke2;
                        }
                        if (i2 == ze) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return b2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double Mm(short[] sArr, HA0<? super Short, Double> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Short.valueOf(sArr[0])).doubleValue();
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Short.valueOf(sArr[i2])).doubleValue());
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double Mn(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                double d3 = dArr[i2];
                if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) > 0) {
                    d2 = d3;
                }
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(d2);
    }

    @NotNull
    public static final C4180Rx1<List<Byte>, List<Byte>> Mo(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            } else {
                arrayList2.add(Byte.valueOf(b2));
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final short Mp(@NotNull short[] sArr, @NotNull VA0<? super Short, ? super Short, Short> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (sArr.length != 0) {
            short s2 = sArr[0];
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    s2 = va0.i(Short.valueOf(s2), Short.valueOf(sArr[i2])).shortValue();
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return s2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer Mq(@NotNull int[] iArr, @NotNull XA0<? super Integer, ? super Integer, ? super Integer, Integer> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int De = De(iArr);
        if (De < 0) {
            return null;
        }
        int i2 = iArr[De];
        for (int i3 = De - 1; i3 >= 0; i3--) {
            i2 = xa0.P(Integer.valueOf(i3), Integer.valueOf(iArr[i3]), Integer.valueOf(i2)).intValue();
        }
        return Integer.valueOf(i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Mr(double[] dArr, R r2, VA0<? super R, ? super Double, ? extends R> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (dArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r2);
        for (double d2 : dArr) {
            r2 = va0.i(r2, Double.valueOf(d2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Ms(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        Ns(bArr, AbstractC10696xN1.X);
    }

    @Nullable
    public static final <T> T Mt(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : tArr) {
            if (ha0.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (!z) {
            return null;
        }
        return t;
    }

    @InterfaceC6480g82(version = "1.4")
    public static void Mu(@NotNull long[] jArr, int i2, int i3) {
        C6562gT0.p(jArr, "<this>");
        C4788Ye.R3(jArr, i2, i3);
        lr(jArr, i2, i3);
    }

    @NotNull
    public static final List<Integer> Mv(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.O3(copyOf);
        return wr(copyOf);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Mw(long[] jArr, HA0<? super Long, Double> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (long j2 : jArr) {
            d2 += ha0.invoke(Long.valueOf(j2)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Short> Mx(@NotNull short[] sArr, int i2) {
        C6562gT0.p(sArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= sArr.length) {
                return Vy(sArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (short s2 : sArr) {
                arrayList.add(Short.valueOf(s2));
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final HashSet<Boolean> My(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return (HashSet) By(zArr, new HashSet(C8683p81.j(zArr.length)));
    }

    @NotNull
    public static final Iterable<C9485sP0<Float>> Mz(@NotNull final float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.bf
            @Override // o.FA0
            public final Object invoke() {
                Iterator Xz;
                Xz = C7330jf.Xz(fArr);
                return Xz;
            }
        });
    }

    @NotNull
    public static final B02<Byte> N5(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return U02.l();
        }
        return new k(bArr);
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Boolean>> M N6(@NotNull boolean[] zArr, @NotNull M m2, @NotNull HA0<? super Boolean, ? extends K> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (boolean z : zArr) {
            m2.put(ha0.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return m2;
    }

    @XP0
    public static final double N7(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return dArr[1];
    }

    public static final int N8(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (int i3 : iArr) {
            if (ha0.invoke(Integer.valueOf(i3)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final List<Short> N9(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Ge = Ge(sArr); -1 < Ge; Ge--) {
            if (!ha0.invoke(Short.valueOf(sArr[Ge])).booleanValue()) {
                return Mx(sArr, Ge + 1);
            }
        }
        return C8222nF.H();
    }

    @NotNull
    public static final <T, R> List<C4180Rx1<T, R>> NA(@NotNull T[] tArr, @NotNull R[] rArr) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(tArr[i2], rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C Na(@NotNull long[] jArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Long, Boolean> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j2 = jArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Long.valueOf(j2)).booleanValue()) {
                c2.add(Long.valueOf(j2));
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    @XP0
    public static final Short Nb(short[] sArr, HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            short s2 = sArr[length];
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                return Short.valueOf(s2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Nc(int[] iArr, VA0<? super Integer, ? super Integer, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), Integer.valueOf(iArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> R Nd(@NotNull short[] sArr, R r2, @NotNull VA0<? super Short, ? super R, ? extends R> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int Ge = Ge(sArr); Ge >= 0; Ge--) {
            r2 = va0.i(Short.valueOf(sArr[Ge]), r2);
        }
        return r2;
    }

    @XP0
    public static final long Ne(long[] jArr, int i2, HA0<? super Integer, Long> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < jArr.length) {
            return jArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).longValue();
    }

    public static final int Nf(@NotNull char[] cArr, char c2) {
        C6562gT0.p(cArr, "<this>");
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c2 == cArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @XP0
    public static final boolean Ng(boolean[] zArr) {
        boolean z;
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final short Nh(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                short s2 = sArr[length];
                if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                    return s2;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Ni(@NotNull double[] dArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Double, ? extends R> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), Double.valueOf(dArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float Nj(short[] sArr, HA0<? super Short, Float> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            float floatValue = ha0.invoke(Short.valueOf(sArr[0])).floatValue();
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Short.valueOf(sArr[i2])).floatValue());
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Nk(long[] jArr, Comparator<? super R> comparator, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Long.valueOf(jArr[0]));
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                R invoke = ha0.invoke(Long.valueOf(jArr[i2]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> char Nl(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            char c2 = cArr[0];
            int Ae = Ae(cArr);
            if (Ae != 0) {
                R invoke = ha0.invoke(Character.valueOf(c2));
                int i2 = 1;
                if (1 <= Ae) {
                    while (true) {
                        char c3 = cArr[i2];
                        R invoke2 = ha0.invoke(Character.valueOf(c3));
                        if (invoke.compareTo(invoke2) > 0) {
                            c2 = c3;
                            invoke = invoke2;
                        }
                        if (i2 == Ae) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return c2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double Nm(boolean[] zArr, HA0<? super Boolean, Double> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                doubleValue = Math.min(doubleValue, ha0.invoke(Boolean.valueOf(zArr[i2])).doubleValue());
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float Nn(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                float f3 = fArr[i2];
                if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) > 0) {
                    f2 = f3;
                }
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    @NotNull
    public static final C4180Rx1<List<Character>, List<Character>> No(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            } else {
                arrayList2.add(Character.valueOf(c2));
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final boolean Np(@NotNull boolean[] zArr, @NotNull VA0<? super Boolean, ? super Boolean, Boolean> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    z = va0.i(Boolean.valueOf(z), Boolean.valueOf(zArr[i2])).booleanValue();
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return z;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long Nq(@NotNull long[] jArr, @NotNull XA0<? super Integer, ? super Long, ? super Long, Long> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Ee = Ee(jArr);
        if (Ee < 0) {
            return null;
        }
        long j2 = jArr[Ee];
        for (int i2 = Ee - 1; i2 >= 0; i2--) {
            j2 = xa0.P(Integer.valueOf(i2), Long.valueOf(jArr[i2]), Long.valueOf(j2)).longValue();
        }
        return Long.valueOf(j2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Nr(float[] fArr, R r2, VA0<? super R, ? super Float, ? extends R> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (fArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r2);
        for (float f2 : fArr) {
            r2 = va0.i(r2, Float.valueOf(f2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Ns(@NotNull byte[] bArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int ze = ze(bArr); ze > 0; ze--) {
            int m2 = abstractC10696xN1.m(ze + 1);
            byte b2 = bArr[ze];
            bArr[ze] = bArr[m2];
            bArr[m2] = b2;
        }
    }

    @Nullable
    public static final Short Nt(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> void Nu(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        C4788Ye.h4(tArr, C11156zH.x());
    }

    @NotNull
    public static final List<Long> Nv(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.Q3(copyOf);
        return xr(copyOf);
    }

    @InterfaceC8046mW0(name = "sumOfDouble")
    public static final double Nw(@NotNull Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        double d2 = 0.0d;
        for (Double d3 : dArr) {
            d2 += d3.doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Boolean> Nx(@NotNull boolean[] zArr, int i2) {
        C6562gT0.p(zArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            if (i2 >= zArr.length) {
                return Wy(zArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Boolean.valueOf(zArr[0]));
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            for (boolean z : zArr) {
                arrayList.add(Boolean.valueOf(z));
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final int[] Ny(@NotNull Integer[] numArr) {
        C6562gT0.p(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    @NotNull
    public static final Iterable<C9485sP0<Integer>> Nz(@NotNull final int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.gf
            @Override // o.FA0
            public final Object invoke() {
                Iterator Vz;
                Vz = C7330jf.Vz(iArr);
                return Vz;
            }
        });
    }

    @NotNull
    public static final B02<Character> O5(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return U02.l();
        }
        return new r(cArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M O6(@NotNull boolean[] zArr, @NotNull M m2, @NotNull HA0<? super Boolean, ? extends K> ha0, @NotNull HA0<? super Boolean, ? extends V> ha02) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (boolean z : zArr) {
            m2.put(ha0.invoke(Boolean.valueOf(z)), ha02.invoke(Boolean.valueOf(z)));
        }
        return m2;
    }

    @XP0
    public static final float O7(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return fArr[1];
    }

    @XP0
    public static final int O8(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public static final List<Boolean> O9(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int He = He(zArr); -1 < He; He--) {
            if (!ha0.invoke(Boolean.valueOf(zArr[He])).booleanValue()) {
                return Nx(zArr, He + 1);
            }
        }
        return C8222nF.H();
    }

    @NotNull
    public static final <T, R, V> List<V> OA(@NotNull T[] tArr, @NotNull R[] rArr, @NotNull VA0<? super T, ? super R, ? extends V> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(tArr[i2], rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C Oa(@NotNull T[] tArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super T, Boolean> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), t).booleanValue()) {
                c2.add(t);
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    public static byte Ob(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Oc(long[] jArr, VA0<? super Integer, ? super Long, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), Long.valueOf(jArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> R Od(@NotNull boolean[] zArr, R r2, @NotNull VA0<? super Boolean, ? super R, ? extends R> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int He = He(zArr); He >= 0; He--) {
            r2 = va0.i(Boolean.valueOf(zArr[He]), r2);
        }
        return r2;
    }

    @XP0
    public static final <T> T Oe(T[] tArr, int i2, HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < tArr.length) {
            return tArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2));
    }

    @InterfaceC9150r20(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @IR1(expression = "indexOfFirst { it == element }", imports = {}))
    @InterfaceC9636t20(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Of(double[] dArr, double d2) {
        C6562gT0.p(dArr, "<this>");
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (d2 == dArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A Og(@NotNull byte[] bArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Byte, ? extends CharSequence> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (byte b2 : bArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ha0 != null) {
                a2.append(ha0.invoke(Byte.valueOf(b2)));
            } else {
                a2.append(String.valueOf((int) b2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final boolean Oh(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[He(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Oi(@NotNull float[] fArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Float, ? extends R> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), Float.valueOf(fArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float Oj(boolean[] zArr, HA0<? super Boolean, Float> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            float floatValue = ha0.invoke(Boolean.valueOf(zArr[0])).floatValue();
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    floatValue = Math.max(floatValue, ha0.invoke(Boolean.valueOf(zArr[i2])).floatValue());
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R Ok(T[] tArr, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(tArr[0]);
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                R invoke = ha0.invoke(tArr[i2]);
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> double Ol(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int Be = Be(dArr);
            if (Be != 0) {
                R invoke = ha0.invoke(Double.valueOf(d2));
                int i2 = 1;
                if (1 <= Be) {
                    while (true) {
                        double d3 = dArr[i2];
                        R invoke2 = ha0.invoke(Double.valueOf(d3));
                        if (invoke.compareTo(invoke2) > 0) {
                            d2 = d3;
                            invoke = invoke2;
                        }
                        if (i2 == Be) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float Om(byte[] bArr, HA0<? super Byte, Float> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Byte.valueOf(bArr[0])).floatValue();
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Byte.valueOf(bArr[i2])).floatValue());
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer On(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int De = De(iArr);
        int i3 = 1;
        if (1 <= De) {
            while (true) {
                int i4 = iArr[i3];
                if (comparator.compare(Integer.valueOf(i2), Integer.valueOf(i4)) > 0) {
                    i2 = i4;
                }
                if (i3 == De) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    @NotNull
    public static final C4180Rx1<List<Double>, List<Double>> Oo(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            } else {
                arrayList2.add(Double.valueOf(d2));
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final byte Op(@NotNull byte[] bArr, @NotNull XA0<? super Integer, ? super Byte, ? super Byte, Byte> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (bArr.length != 0) {
            byte b2 = bArr[0];
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    b2 = xa0.P(Integer.valueOf(i2), Byte.valueOf(b2), Byte.valueOf(bArr[i2])).byteValue();
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return b2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S Oq(@NotNull T[] tArr, @NotNull XA0<? super Integer, ? super T, ? super S, ? extends S> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Fe = Fe(tArr);
        if (Fe < 0) {
            return null;
        }
        Object obj = (S) tArr[Fe];
        for (int i2 = Fe - 1; i2 >= 0; i2--) {
            obj = (S) xa0.P(Integer.valueOf(i2), (Object) tArr[i2], obj);
        }
        return (S) obj;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Or(int[] iArr, R r2, VA0<? super R, ? super Integer, ? extends R> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (iArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r2);
        for (int i2 : iArr) {
            r2 = va0.i(r2, Integer.valueOf(i2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Os(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        Ps(cArr, AbstractC10696xN1.X);
    }

    @Nullable
    public static final Short Ot(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Short sh = null;
        boolean z = false;
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                if (z) {
                    return null;
                }
                sh = Short.valueOf(s2);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return sh;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final <T extends Comparable<? super T>> void Ou(@NotNull T[] tArr, int i2, int i3) {
        C6562gT0.p(tArr, "<this>");
        C4788Ye.i4(tArr, C11156zH.x(), i2, i3);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> Ov(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return Wv(tArr, C11156zH.x());
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double Ow(T[] tArr, HA0<? super T, Double> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (T t : tArr) {
            d2 += ha0.invoke(t).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Byte> Ox(@NotNull byte[] bArr, int i2) {
        C6562gT0.p(bArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = bArr.length;
            if (i2 >= length) {
                return Oy(bArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Byte.valueOf(bArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(Byte.valueOf(bArr[i3]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> Oy(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                return Yy(bArr);
            }
            return C7979mF.k(Byte.valueOf(bArr[0]));
        }
        return C8222nF.H();
    }

    @NotNull
    public static final Iterable<C9485sP0<Long>> Oz(@NotNull final long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.df
            @Override // o.FA0
            public final Object invoke() {
                Iterator Wz;
                Wz = C7330jf.Wz(jArr);
                return Wz;
            }
        });
    }

    @NotNull
    public static final B02<Double> P5(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return U02.l();
        }
        return new p(dArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M P6(@NotNull byte[] bArr, @NotNull M m2, @NotNull HA0<? super Byte, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (byte b2 : bArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Byte.valueOf(b2));
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final int P7(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return iArr[1];
    }

    public static final int P8(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final List<Byte> P9(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (byte b2 : bArr) {
            if (z) {
                arrayList.add(Byte.valueOf(b2));
            } else if (!ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<C4180Rx1<Short, R>> PA(@NotNull short[] sArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(Short.valueOf(sArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C Pa(@NotNull short[] sArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Short, Boolean> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s2 = sArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Short.valueOf(s2)).booleanValue()) {
                c2.add(Short.valueOf(s2));
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    public static final byte Pb(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                return b2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> List<R> Pc(T[] tArr, VA0<? super Integer, ? super T, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> R Pd(@NotNull byte[] bArr, R r2, @NotNull XA0<? super Integer, ? super Byte, ? super R, ? extends R> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int ze = ze(bArr); ze >= 0; ze--) {
            r2 = xa0.P(Integer.valueOf(ze), Byte.valueOf(bArr[ze]), r2);
        }
        return r2;
    }

    @XP0
    public static final short Pe(short[] sArr, int i2, HA0<? super Integer, Short> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < sArr.length) {
            return sArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).shortValue();
    }

    @InterfaceC9150r20(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @IR1(expression = "indexOfFirst { it == element }", imports = {}))
    @InterfaceC9636t20(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Pf(float[] fArr, float f2) {
        C6562gT0.p(fArr, "<this>");
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (f2 == fArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A Pg(@NotNull char[] cArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Character, ? extends CharSequence> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (char c2 : cArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ha0 != null) {
                a2.append(ha0.invoke(Character.valueOf(c2)));
            } else {
                a2.append(c2);
            }
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final boolean Ph(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                boolean z = zArr[length];
                if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                    return z;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Pi(@NotNull int[] iArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Integer, ? extends R> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), Integer.valueOf(iArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Pj(byte[] bArr, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            R invoke = ha0.invoke(Byte.valueOf(bArr[0]));
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    R invoke2 = ha0.invoke(Byte.valueOf(bArr[i2]));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Pk(short[] sArr, Comparator<? super R> comparator, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Short.valueOf(sArr[0]));
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                R invoke = ha0.invoke(Short.valueOf(sArr[i2]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> float Pl(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            float f2 = fArr[0];
            int Ce = Ce(fArr);
            if (Ce != 0) {
                R invoke = ha0.invoke(Float.valueOf(f2));
                int i2 = 1;
                if (1 <= Ce) {
                    while (true) {
                        float f3 = fArr[i2];
                        R invoke2 = ha0.invoke(Float.valueOf(f3));
                        if (invoke.compareTo(invoke2) > 0) {
                            f2 = f3;
                            invoke = invoke2;
                        }
                        if (i2 == Ce) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return f2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float Pm(char[] cArr, HA0<? super Character, Float> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Character.valueOf(cArr[0])).floatValue();
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Character.valueOf(cArr[i2])).floatValue());
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long Pn(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                long j3 = jArr[i2];
                if (comparator.compare(Long.valueOf(j2), Long.valueOf(j3)) > 0) {
                    j2 = j3;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Long.valueOf(j2);
    }

    @NotNull
    public static final C4180Rx1<List<Float>, List<Float>> Po(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            } else {
                arrayList2.add(Float.valueOf(f2));
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final char Pp(@NotNull char[] cArr, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (cArr.length != 0) {
            char c2 = cArr[0];
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    c2 = xa0.P(Integer.valueOf(i2), Character.valueOf(c2), Character.valueOf(cArr[i2])).charValue();
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return c2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short Pq(@NotNull short[] sArr, @NotNull XA0<? super Integer, ? super Short, ? super Short, Short> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Ge = Ge(sArr);
        if (Ge < 0) {
            return null;
        }
        short s2 = sArr[Ge];
        for (int i2 = Ge - 1; i2 >= 0; i2--) {
            s2 = xa0.P(Integer.valueOf(i2), Short.valueOf(sArr[i2]), Short.valueOf(s2)).shortValue();
        }
        return Short.valueOf(s2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Pr(long[] jArr, R r2, VA0<? super R, ? super Long, ? extends R> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (jArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r2);
        for (long j2 : jArr) {
            r2 = va0.i(r2, Long.valueOf(j2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Ps(@NotNull char[] cArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int Ae = Ae(cArr); Ae > 0; Ae--) {
            int m2 = abstractC10696xN1.m(Ae + 1);
            char c2 = cArr[Ae];
            cArr[Ae] = cArr[m2];
            cArr[m2] = c2;
        }
    }

    @NotNull
    public static final List<Byte> Pt(@NotNull byte[] bArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(Byte.valueOf(bArr[num.intValue()]));
        }
        return arrayList;
    }

    public static final void Pu(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length > 1) {
            C4788Ye.W3(sArr);
            or(sArr);
        }
    }

    @NotNull
    public static final List<Short> Pv(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.W3(copyOf);
        return zr(copyOf);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Pw(short[] sArr, HA0<? super Short, Double> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (short s2 : sArr) {
            d2 += ha0.invoke(Short.valueOf(s2)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Character> Px(@NotNull char[] cArr, int i2) {
        C6562gT0.p(cArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = cArr.length;
            if (i2 >= length) {
                return Py(cArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Character.valueOf(cArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(Character.valueOf(cArr[i3]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Character> Py(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                return Zy(cArr);
            }
            return C7979mF.k(Character.valueOf(cArr[0]));
        }
        return C8222nF.H();
    }

    @NotNull
    public static final <T> Iterable<C9485sP0<T>> Pz(@NotNull final T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.ff
            @Override // o.FA0
            public final Object invoke() {
                Iterator Sz;
                Sz = C7330jf.Sz(tArr);
                return Sz;
            }
        });
    }

    @NotNull
    public static final B02<Float> Q5(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return U02.l();
        }
        return new o(fArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M Q6(@NotNull char[] cArr, @NotNull M m2, @NotNull HA0<? super Character, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (char c2 : cArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Character.valueOf(c2));
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final long Q7(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return jArr[1];
    }

    @XP0
    public static final <T> int Q8(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return tArr.length;
    }

    @NotNull
    public static final List<Character> Q9(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (char c2 : cArr) {
            if (z) {
                arrayList.add(Character.valueOf(c2));
            } else if (!ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> QA(@NotNull short[] sArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super Short, ? super R, ? extends V> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(Short.valueOf(sArr[i2]), obj));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C Qa(@NotNull boolean[] zArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Boolean, Boolean> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "predicate");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Boolean.valueOf(z)).booleanValue()) {
                c2.add(Boolean.valueOf(z));
            }
            i2++;
            i3 = i4;
        }
        return c2;
    }

    public static final char Qb(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Qc(short[] sArr, VA0<? super Integer, ? super Short, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), Short.valueOf(sArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> R Qd(@NotNull char[] cArr, R r2, @NotNull XA0<? super Integer, ? super Character, ? super R, ? extends R> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int Ae = Ae(cArr); Ae >= 0; Ae--) {
            r2 = xa0.P(Integer.valueOf(Ae), Character.valueOf(cArr[Ae]), r2);
        }
        return r2;
    }

    @XP0
    public static final boolean Qe(boolean[] zArr, int i2, HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < zArr.length) {
            return zArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).booleanValue();
    }

    public static int Qf(@NotNull int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A Qg(@NotNull double[] dArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Double, ? extends CharSequence> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (double d2 : dArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ha0 != null) {
                a2.append(ha0.invoke(Double.valueOf(d2)));
            } else {
                a2.append(String.valueOf(d2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static int Qh(@NotNull byte[] bArr, byte b2) {
        C6562gT0.p(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (b2 == bArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Qi(@NotNull long[] jArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Long, ? extends R> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), Long.valueOf(jArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Qj(char[] cArr, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            R invoke = ha0.invoke(Character.valueOf(cArr[0]));
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    R invoke2 = ha0.invoke(Character.valueOf(cArr[i2]));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Qk(boolean[] zArr, Comparator<? super R> comparator, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Boolean.valueOf(zArr[0]));
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                R invoke = ha0.invoke(Boolean.valueOf(zArr[i2]));
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> int Ql(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int De = De(iArr);
            if (De != 0) {
                R invoke = ha0.invoke(Integer.valueOf(i2));
                int i3 = 1;
                if (1 <= De) {
                    while (true) {
                        int i4 = iArr[i3];
                        R invoke2 = ha0.invoke(Integer.valueOf(i4));
                        if (invoke.compareTo(invoke2) > 0) {
                            i2 = i4;
                            invoke = invoke2;
                        }
                        if (i3 == De) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            return i2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float Qm(double[] dArr, HA0<? super Double, Float> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Double.valueOf(dArr[0])).floatValue();
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Double.valueOf(dArr[i2])).floatValue());
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T Qn(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                T t2 = tArr[i2];
                if (comparator.compare(t, t2) > 0) {
                    t = t2;
                }
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return t;
    }

    @NotNull
    public static final C4180Rx1<List<Integer>, List<Integer>> Qo(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                arrayList.add(Integer.valueOf(i2));
            } else {
                arrayList2.add(Integer.valueOf(i2));
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final double Qp(@NotNull double[] dArr, @NotNull XA0<? super Integer, ? super Double, ? super Double, Double> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    d2 = xa0.P(Integer.valueOf(i2), Double.valueOf(d2), Double.valueOf(dArr[i2])).doubleValue();
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return d2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Boolean Qq(@NotNull boolean[] zArr, @NotNull VA0<? super Boolean, ? super Boolean, Boolean> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        int He = He(zArr);
        if (He < 0) {
            return null;
        }
        boolean z = zArr[He];
        for (int i2 = He - 1; i2 >= 0; i2--) {
            z = va0.i(Boolean.valueOf(zArr[i2]), Boolean.valueOf(z)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> List<R> Qr(@NotNull T[] tArr, R r2, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (tArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r2);
        for (Manifest manifest : tArr) {
            r2 = va0.i(r2, manifest);
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Qs(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        Rs(dArr, AbstractC10696xN1.X);
    }

    @NotNull
    public static final List<Byte> Qt(@NotNull byte[] bArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.n(C4788Ye.f1(bArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Qu(@NotNull short[] sArr, int i2, int i3) {
        C6562gT0.p(sArr, "<this>");
        C4788Ye.X3(sArr, i2, i3);
        pr(sArr, i2, i3);
    }

    @NotNull
    public static final List<Byte> Qv(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Byte[] N4 = C4788Ye.N4(bArr);
        C4788Ye.h4(N4, comparator);
        return C4788Ye.t(N4);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfDouble")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Qw(boolean[] zArr, HA0<? super Boolean, Double> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (boolean z : zArr) {
            d2 += ha0.invoke(Boolean.valueOf(z)).doubleValue();
        }
        return d2;
    }

    @NotNull
    public static final List<Double> Qx(@NotNull double[] dArr, int i2) {
        C6562gT0.p(dArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = dArr.length;
            if (i2 >= length) {
                return Qy(dArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Double.valueOf(dArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(Double.valueOf(dArr[i3]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Double> Qy(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                return az(dArr);
            }
            return C7979mF.k(Double.valueOf(dArr[0]));
        }
        return C8222nF.H();
    }

    @NotNull
    public static final Iterable<C9485sP0<Short>> Qz(@NotNull final short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.af
            @Override // o.FA0
            public final Object invoke() {
                Iterator Uz;
                Uz = C7330jf.Uz(sArr);
                return Uz;
            }
        });
    }

    @NotNull
    public static final B02<Integer> R5(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return U02.l();
        }
        return new m(iArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M R6(@NotNull double[] dArr, @NotNull M m2, @NotNull HA0<? super Double, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (double d2 : dArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Double.valueOf(d2));
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final <T> T R7(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return tArr[1];
    }

    public static final <T> int R8(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final List<Double> R9(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (double d2 : dArr) {
            if (z) {
                arrayList.add(Double.valueOf(d2));
            } else if (!ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<C4180Rx1<Short, R>> RA(@NotNull short[] sArr, @NotNull R[] rArr) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            short s2 = sArr[i2];
            arrayList.add(C6670gv2.a(Short.valueOf(s2), rArr[i2]));
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> Ra(Object[] objArr) {
        C6562gT0.p(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            C6562gT0.y(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char Rb(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                return c2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterable")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Rc(boolean[] zArr, VA0<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(arrayList, va0.i(Integer.valueOf(i3), Boolean.valueOf(zArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> R Rd(@NotNull double[] dArr, R r2, @NotNull XA0<? super Integer, ? super Double, ? super R, ? extends R> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int Be = Be(dArr); Be >= 0; Be--) {
            r2 = xa0.P(Integer.valueOf(Be), Double.valueOf(dArr[Be]), r2);
        }
        return r2;
    }

    @Nullable
    public static final Boolean Re(@NotNull boolean[] zArr, int i2) {
        C6562gT0.p(zArr, "<this>");
        if (i2 >= 0 && i2 < zArr.length) {
            return Boolean.valueOf(zArr[i2]);
        }
        return null;
    }

    public static int Rf(@NotNull long[] jArr, long j2) {
        C6562gT0.p(jArr, "<this>");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A Rg(@NotNull float[] fArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Float, ? extends CharSequence> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (float f2 : fArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ha0 != null) {
                a2.append(ha0.invoke(Float.valueOf(f2)));
            } else {
                a2.append(String.valueOf(f2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final int Rh(@NotNull char[] cArr, char c2) {
        C6562gT0.p(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (c2 == cArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C Ri(@NotNull T[] tArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Rj(double[] dArr, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            R invoke = ha0.invoke(Double.valueOf(dArr[0]));
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    R invoke2 = ha0.invoke(Double.valueOf(dArr[i2]));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte Rk(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                byte b3 = bArr[i2];
                if (b2 < b3) {
                    b2 = b3;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Byte.valueOf(b2);
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> long Rl(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            long j2 = jArr[0];
            int Ee = Ee(jArr);
            if (Ee != 0) {
                R invoke = ha0.invoke(Long.valueOf(j2));
                int i2 = 1;
                if (1 <= Ee) {
                    while (true) {
                        long j3 = jArr[i2];
                        R invoke2 = ha0.invoke(Long.valueOf(j3));
                        if (invoke.compareTo(invoke2) > 0) {
                            j2 = j3;
                            invoke = invoke2;
                        }
                        if (i2 == Ee) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return j2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float Rm(float[] fArr, HA0<? super Float, Float> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Float.valueOf(fArr[0])).floatValue();
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Float.valueOf(fArr[i2])).floatValue());
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short Rn(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                short s3 = sArr[i2];
                if (comparator.compare(Short.valueOf(s2), Short.valueOf(s3)) > 0) {
                    s2 = s3;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Short.valueOf(s2);
    }

    @NotNull
    public static final C4180Rx1<List<Long>, List<Long>> Ro(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
            } else {
                arrayList2.add(Long.valueOf(j2));
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final float Rp(@NotNull float[] fArr, @NotNull XA0<? super Integer, ? super Float, ? super Float, Float> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (fArr.length != 0) {
            float f2 = fArr[0];
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    f2 = xa0.P(Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(fArr[i2])).floatValue();
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return f2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte Rq(@NotNull byte[] bArr, @NotNull VA0<? super Byte, ? super Byte, Byte> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        int ze = ze(bArr);
        if (ze < 0) {
            return null;
        }
        byte b2 = bArr[ze];
        for (int i2 = ze - 1; i2 >= 0; i2--) {
            b2 = va0.i(Byte.valueOf(bArr[i2]), Byte.valueOf(b2)).byteValue();
        }
        return Byte.valueOf(b2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Rr(short[] sArr, R r2, VA0<? super R, ? super Short, ? extends R> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (sArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r2);
        for (short s2 : sArr) {
            r2 = va0.i(r2, Short.valueOf(s2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Rs(@NotNull double[] dArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int Be = Be(dArr); Be > 0; Be--) {
            int m2 = abstractC10696xN1.m(Be + 1);
            double d2 = dArr[Be];
            dArr[Be] = dArr[m2];
            dArr[m2] = d2;
        }
    }

    @NotNull
    public static final List<Character> Rt(@NotNull char[] cArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(Character.valueOf(cArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> Ru(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        Byte[] N4 = C4788Ye.N4(bArr);
        C4788Ye.U3(N4);
        return C4788Ye.t(N4);
    }

    @NotNull
    public static final List<Character> Rv(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Character[] O4 = C4788Ye.O4(cArr);
        C4788Ye.h4(O4, comparator);
        return C4788Ye.t(O4);
    }

    @InterfaceC8046mW0(name = "sumOfFloat")
    public static final float Rw(@NotNull Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        float f2 = 0.0f;
        for (Float f3 : fArr) {
            f2 += f3.floatValue();
        }
        return f2;
    }

    @NotNull
    public static final List<Float> Rx(@NotNull float[] fArr, int i2) {
        C6562gT0.p(fArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = fArr.length;
            if (i2 >= length) {
                return Ry(fArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Float.valueOf(fArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(Float.valueOf(fArr[i3]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> Ry(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                return bz(fArr);
            }
            return C7979mF.k(Float.valueOf(fArr[0]));
        }
        return C8222nF.H();
    }

    @NotNull
    public static final Iterable<C9485sP0<Boolean>> Rz(@NotNull final boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return new C9728tP0(new FA0() { // from class: o.cf
            @Override // o.FA0
            public final Object invoke() {
                Iterator Zz;
                Zz = C7330jf.Zz(zArr);
                return Zz;
            }
        });
    }

    @NotNull
    public static final B02<Long> S5(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return U02.l();
        }
        return new n(jArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M S6(@NotNull float[] fArr, @NotNull M m2, @NotNull HA0<? super Float, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (float f2 : fArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Float.valueOf(f2));
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final short S7(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return sArr[1];
    }

    @XP0
    public static final int S8(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return sArr.length;
    }

    @NotNull
    public static final List<Float> S9(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (float f2 : fArr) {
            if (z) {
                arrayList.add(Float.valueOf(f2));
            } else if (!ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> SA(@NotNull short[] sArr, @NotNull R[] rArr, @NotNull VA0<? super Short, ? super R, ? extends V> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Short.valueOf(sArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C Sa(Object[] objArr, C c2) {
        C6562gT0.p(objArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (Object obj : objArr) {
            C6562gT0.y(3, "R");
            if (obj != null) {
                c2.add(obj);
            }
        }
        return c2;
    }

    public static final double Sb(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C Sc(byte[] bArr, C c2, VA0<? super Integer, ? super Byte, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), Byte.valueOf(bArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final <R> R Sd(@NotNull float[] fArr, R r2, @NotNull XA0<? super Integer, ? super Float, ? super R, ? extends R> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int Ce = Ce(fArr); Ce >= 0; Ce--) {
            r2 = xa0.P(Integer.valueOf(Ce), Float.valueOf(fArr[Ce]), r2);
        }
        return r2;
    }

    @Nullable
    public static final Byte Se(@NotNull byte[] bArr, int i2) {
        C6562gT0.p(bArr, "<this>");
        if (i2 >= 0 && i2 < bArr.length) {
            return Byte.valueOf(bArr[i2]);
        }
        return null;
    }

    public static <T> int Sf(@NotNull T[] tArr, T t) {
        C6562gT0.p(tArr, "<this>");
        int i2 = 0;
        if (t == null) {
            int length = tArr.length;
            while (i2 < length) {
                if (tArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            if (C6562gT0.g(t, tArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A Sg(@NotNull int[] iArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Integer, ? extends CharSequence> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (int i4 : iArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ha0 != null) {
                a2.append(ha0.invoke(Integer.valueOf(i4)));
            } else {
                a2.append(String.valueOf(i4));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @InterfaceC9150r20(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @IR1(expression = "indexOfLast { it == element }", imports = {}))
    @InterfaceC9636t20(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Sh(double[] dArr, double d2) {
        C6562gT0.p(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (d2 == dArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Si(@NotNull short[] sArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Short, ? extends R> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), Short.valueOf(sArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Sj(float[] fArr, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            R invoke = ha0.invoke(Float.valueOf(fArr[0]));
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    R invoke2 = ha0.invoke(Float.valueOf(fArr[i2]));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character Sk(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                char c3 = cArr[i2];
                if (C6562gT0.t(c2, c3) < 0) {
                    c2 = c3;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Character.valueOf(c2);
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T Sl(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            T t = tArr[0];
            int Fe = Fe(tArr);
            if (Fe != 0) {
                R invoke = ha0.invoke(t);
                int i2 = 1;
                if (1 <= Fe) {
                    while (true) {
                        T t2 = tArr[i2];
                        R invoke2 = ha0.invoke(t2);
                        if (invoke.compareTo(invoke2) > 0) {
                            t = t2;
                            invoke = invoke2;
                        }
                        if (i2 == Fe) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float Sm(int[] iArr, HA0<? super Integer, Float> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Integer.valueOf(iArr[0])).floatValue();
        int De = De(iArr);
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Integer.valueOf(iArr[i2])).floatValue());
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final byte Sn(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (bArr.length != 0) {
            byte b2 = bArr[0];
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    byte b3 = bArr[i2];
                    if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) > 0) {
                        b2 = b3;
                    }
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return b2;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T> C4180Rx1<List<T>, List<T>> So(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final int Sp(@NotNull int[] iArr, @NotNull XA0<? super Integer, ? super Integer, ? super Integer, Integer> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int De = De(iArr);
            int i3 = 1;
            if (1 <= De) {
                while (true) {
                    i2 = xa0.P(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(iArr[i3])).intValue();
                    if (i3 == De) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character Sq(@NotNull char[] cArr, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Ae = Ae(cArr);
        if (Ae < 0) {
            return null;
        }
        char c2 = cArr[Ae];
        for (int i2 = Ae - 1; i2 >= 0; i2--) {
            c2 = va0.i(Character.valueOf(cArr[i2]), Character.valueOf(c2)).charValue();
        }
        return Character.valueOf(c2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Sr(boolean[] zArr, R r2, VA0<? super R, ? super Boolean, ? extends R> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (zArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r2);
        for (boolean z : zArr) {
            r2 = va0.i(r2, Boolean.valueOf(z));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Ss(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        Ts(fArr, AbstractC10696xN1.X);
    }

    @NotNull
    public static final List<Character> St(@NotNull char[] cArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.o(C4788Ye.g1(cArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @NotNull
    public static final List<Character> Su(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        Character[] O4 = C4788Ye.O4(cArr);
        C4788Ye.U3(O4);
        return C4788Ye.t(O4);
    }

    @NotNull
    public static final List<Double> Sv(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Double[] P4 = C4788Ye.P4(dArr);
        C4788Ye.h4(P4, comparator);
        return C4788Ye.t(P4);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int Sw(byte[] bArr, HA0<? super Byte, Integer> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (byte b2 : bArr) {
            i2 += ha0.invoke(Byte.valueOf(b2)).intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Integer> Sx(@NotNull int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = iArr.length;
            if (i2 >= length) {
                return Sy(iArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Integer.valueOf(iArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(Integer.valueOf(iArr[i3]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> Sy(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return cz(iArr);
            }
            return C7979mF.k(Integer.valueOf(iArr[0]));
        }
        return C8222nF.H();
    }

    public static final Iterator Sz(Object[] objArr) {
        return C9046qe.a(objArr);
    }

    @NotNull
    public static <T> B02<T> T5(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return U02.l();
        }
        return new j(tArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M T6(@NotNull int[] iArr, @NotNull M m2, @NotNull HA0<? super Integer, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (int i2 : iArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Integer.valueOf(i2));
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final boolean T7(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return zArr[1];
    }

    public static final int T8(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final List<Integer> T9(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i2 : iArr) {
            if (z) {
                arrayList.add(Integer.valueOf(i2));
            } else if (!ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                arrayList.add(Integer.valueOf(i2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<C4180Rx1<Short, Short>> TA(@NotNull short[] sArr, @NotNull short[] sArr2) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(sArr2, "other");
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(Short.valueOf(sArr[i2]), Short.valueOf(sArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> Ta(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            if (!ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    public static final double Tb(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                return d2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C Tc(char[] cArr, C c2, VA0<? super Integer, ? super Character, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), Character.valueOf(cArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final <R> R Td(@NotNull int[] iArr, R r2, @NotNull XA0<? super Integer, ? super Integer, ? super R, ? extends R> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int De = De(iArr); De >= 0; De--) {
            r2 = xa0.P(Integer.valueOf(De), Integer.valueOf(iArr[De]), r2);
        }
        return r2;
    }

    @Nullable
    public static final Character Te(@NotNull char[] cArr, int i2) {
        C6562gT0.p(cArr, "<this>");
        if (i2 >= 0 && i2 < cArr.length) {
            return Character.valueOf(cArr[i2]);
        }
        return null;
    }

    public static int Tf(@NotNull short[] sArr, short s2) {
        C6562gT0.p(sArr, "<this>");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (s2 == sArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A Tg(@NotNull long[] jArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Long, ? extends CharSequence> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (long j2 : jArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ha0 != null) {
                a2.append(ha0.invoke(Long.valueOf(j2)));
            } else {
                a2.append(String.valueOf(j2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @InterfaceC9150r20(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @IR1(expression = "indexOfLast { it == element }", imports = {}))
    @InterfaceC9636t20(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int Th(float[] fArr, float f2) {
        C6562gT0.p(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (f2 == fArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Ti(@NotNull boolean[] zArr, @NotNull C c2, @NotNull VA0<? super Integer, ? super Boolean, ? extends R> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            c2.add(va0.i(Integer.valueOf(i3), Boolean.valueOf(zArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Tj(int[] iArr, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            R invoke = ha0.invoke(Integer.valueOf(iArr[0]));
            int De = De(iArr);
            int i2 = 1;
            if (1 <= De) {
                while (true) {
                    R invoke2 = ha0.invoke(Integer.valueOf(iArr[i2]));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == De) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T Tk(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                T t2 = tArr[i2];
                if (t.compareTo(t2) < 0) {
                    t = t2;
                }
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return t;
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> short Tl(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            short s2 = sArr[0];
            int Ge = Ge(sArr);
            if (Ge != 0) {
                R invoke = ha0.invoke(Short.valueOf(s2));
                int i2 = 1;
                if (1 <= Ge) {
                    while (true) {
                        short s3 = sArr[i2];
                        R invoke2 = ha0.invoke(Short.valueOf(s3));
                        if (invoke.compareTo(invoke2) > 0) {
                            s2 = s3;
                            invoke = invoke2;
                        }
                        if (i2 == Ge) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return s2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float Tm(long[] jArr, HA0<? super Long, Float> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Long.valueOf(jArr[0])).floatValue();
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Long.valueOf(jArr[i2])).floatValue());
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final char Tn(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (cArr.length != 0) {
            char c2 = cArr[0];
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    char c3 = cArr[i2];
                    if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) > 0) {
                        c2 = c3;
                    }
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return c2;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final C4180Rx1<List<Short>, List<Short>> To(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
            } else {
                arrayList2.add(Short.valueOf(s2));
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final long Tp(@NotNull long[] jArr, @NotNull XA0<? super Integer, ? super Long, ? super Long, Long> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (jArr.length != 0) {
            long j2 = jArr[0];
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    j2 = xa0.P(Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(jArr[i2])).longValue();
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return j2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double Tq(@NotNull double[] dArr, @NotNull VA0<? super Double, ? super Double, Double> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Be = Be(dArr);
        if (Be < 0) {
            return null;
        }
        double d2 = dArr[Be];
        for (int i2 = Be - 1; i2 >= 0; i2--) {
            d2 = va0.i(Double.valueOf(dArr[i2]), Double.valueOf(d2)).doubleValue();
        }
        return Double.valueOf(d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Tr(byte[] bArr, R r2, XA0<? super Integer, ? super R, ? super Byte, ? extends R> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (bArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r2);
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Byte.valueOf(bArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Ts(@NotNull float[] fArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int Ce = Ce(fArr); Ce > 0; Ce--) {
            int m2 = abstractC10696xN1.m(Ce + 1);
            float f2 = fArr[Ce];
            fArr[Ce] = fArr[m2];
            fArr[m2] = f2;
        }
    }

    @NotNull
    public static final List<Double> Tt(@NotNull double[] dArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(Double.valueOf(dArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> Tu(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        Double[] P4 = C4788Ye.P4(dArr);
        C4788Ye.U3(P4);
        return C4788Ye.t(P4);
    }

    @NotNull
    public static final List<Float> Tv(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Float[] Q4 = C4788Ye.Q4(fArr);
        C4788Ye.h4(Q4, comparator);
        return C4788Ye.t(Q4);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int Tw(char[] cArr, HA0<? super Character, Integer> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (char c2 : cArr) {
            i2 += ha0.invoke(Character.valueOf(c2)).intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Long> Tx(@NotNull long[] jArr, int i2) {
        C6562gT0.p(jArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = jArr.length;
            if (i2 >= length) {
                return Ty(jArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Long.valueOf(jArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(Long.valueOf(jArr[i3]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> Ty(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                return dz(jArr);
            }
            return C7979mF.k(Long.valueOf(jArr[0]));
        }
        return C8222nF.H();
    }

    public static final Iterator Tz(byte[] bArr) {
        return C9295re.b(bArr);
    }

    @NotNull
    public static final B02<Short> U5(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return U02.l();
        }
        return new l(sArr);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M U6(@NotNull long[] jArr, @NotNull M m2, @NotNull HA0<? super Long, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (long j2 : jArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Long.valueOf(j2));
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final byte U7(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return bArr[2];
    }

    @XP0
    public static final int U8(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return zArr.length;
    }

    @NotNull
    public static final List<Long> U9(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (long j2 : jArr) {
            if (z) {
                arrayList.add(Long.valueOf(j2));
            } else if (!ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> UA(@NotNull short[] sArr, @NotNull short[] sArr2, @NotNull VA0<? super Short, ? super Short, ? extends V> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(sArr2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Short.valueOf(sArr[i2]), Short.valueOf(sArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> Ua(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            if (!ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    public static final float Ub(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C Uc(double[] dArr, C c2, VA0<? super Integer, ? super Double, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), Double.valueOf(dArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final <R> R Ud(@NotNull long[] jArr, R r2, @NotNull XA0<? super Integer, ? super Long, ? super R, ? extends R> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int Ee = Ee(jArr); Ee >= 0; Ee--) {
            r2 = xa0.P(Integer.valueOf(Ee), Long.valueOf(jArr[Ee]), r2);
        }
        return r2;
    }

    @Nullable
    public static final Double Ue(@NotNull double[] dArr, int i2) {
        C6562gT0.p(dArr, "<this>");
        if (i2 >= 0 && i2 < dArr.length) {
            return Double.valueOf(dArr[i2]);
        }
        return null;
    }

    public static final int Uf(@NotNull boolean[] zArr, boolean z) {
        C6562gT0.p(zArr, "<this>");
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (z == zArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <T, A extends Appendable> A Ug(@NotNull T[] tArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super T, ? extends CharSequence> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (T t : tArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            C6849hf2.b(a2, t, ha0);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static int Uh(@NotNull int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (i2 == iArr[length]) {
                    return length;
                }
                if (i3 < 0) {
                    break;
                }
                length = i3;
            }
        }
        return -1;
    }

    @NotNull
    public static final <T, R> List<R> Ui(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            R invoke = ha0.invoke(t);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Uj(long[] jArr, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            R invoke = ha0.invoke(Long.valueOf(jArr[0]));
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    R invoke2 = ha0.invoke(Long.valueOf(jArr[i2]));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double Uk(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                d2 = Math.max(d2, dArr[i2]);
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(d2);
    }

    @InterfaceC8046mW0(name = "minByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean Ul(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int He = He(zArr);
            if (He != 0) {
                R invoke = ha0.invoke(Boolean.valueOf(z));
                int i2 = 1;
                if (1 <= He) {
                    while (true) {
                        boolean z2 = zArr[i2];
                        R invoke2 = ha0.invoke(Boolean.valueOf(z2));
                        if (invoke.compareTo(invoke2) > 0) {
                            z = z2;
                            invoke = invoke2;
                        }
                        if (i2 == He) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return z;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Float Um(T[] tArr, HA0<? super T, Float> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(tArr[0]).floatValue();
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(tArr[i2]).floatValue());
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double Un(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    double d3 = dArr[i2];
                    if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) > 0) {
                        d2 = d3;
                    }
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final C4180Rx1<List<Boolean>, List<Boolean>> Uo(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            } else {
                arrayList2.add(Boolean.valueOf(z));
            }
        }
        return new C4180Rx1<>(arrayList, arrayList2);
    }

    public static final <S, T extends S> S Up(@NotNull T[] tArr, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (tArr.length != 0) {
            S s2 = (Object) tArr[0];
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    s2 = xa0.P(Integer.valueOf(i2), s2, (Object) tArr[i2]);
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return (S) s2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float Uq(@NotNull float[] fArr, @NotNull VA0<? super Float, ? super Float, Float> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Ce = Ce(fArr);
        if (Ce < 0) {
            return null;
        }
        float f2 = fArr[Ce];
        for (int i2 = Ce - 1; i2 >= 0; i2--) {
            f2 = va0.i(Float.valueOf(fArr[i2]), Float.valueOf(f2)).floatValue();
        }
        return Float.valueOf(f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Ur(char[] cArr, R r2, XA0<? super Integer, ? super R, ? super Character, ? extends R> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (cArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r2);
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Character.valueOf(cArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Us(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        Vs(iArr, AbstractC10696xN1.X);
    }

    @NotNull
    public static final List<Double> Ut(@NotNull double[] dArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.p(C4788Ye.h1(dArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @NotNull
    public static final List<Float> Uu(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        Float[] Q4 = C4788Ye.Q4(fArr);
        C4788Ye.U3(Q4);
        return C4788Ye.t(Q4);
    }

    @NotNull
    public static final List<Integer> Uv(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Integer[] R4 = C4788Ye.R4(iArr);
        C4788Ye.h4(R4, comparator);
        return C4788Ye.t(R4);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int Uw(double[] dArr, HA0<? super Double, Integer> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (double d2 : dArr) {
            i2 += ha0.invoke(Double.valueOf(d2)).intValue();
        }
        return i2;
    }

    @NotNull
    public static final <T> List<T> Ux(@NotNull T[] tArr, int i2) {
        C6562gT0.p(tArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = tArr.length;
            if (i2 >= length) {
                return Uy(tArr);
            }
            if (i2 == 1) {
                return C7979mF.k(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(tArr[i3]);
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static <T> List<T> Uy(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return ez(tArr);
            }
            return C7979mF.k(tArr[0]);
        }
        return C8222nF.H();
    }

    public static final Iterator Uz(short[] sArr) {
        return C9295re.h(sArr);
    }

    @NotNull
    public static final B02<Boolean> V5(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return U02.l();
        }
        return new q(zArr);
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M V6(@NotNull T[] tArr, @NotNull M m2, @NotNull HA0<? super T, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (T t : tArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(t);
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final char V7(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return cArr[2];
    }

    public static final int V8(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int i2 = 0;
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @NotNull
    public static final <T> List<T> V9(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (T t : tArr) {
            if (z) {
                arrayList.add(t);
            } else if (!ha0.invoke(t).booleanValue()) {
                arrayList.add(t);
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<C4180Rx1<Boolean, R>> VA(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(Boolean.valueOf(zArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> Va(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (!ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    public static final float Vb(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                return f2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C Vc(float[] fArr, C c2, VA0<? super Integer, ? super Float, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), Float.valueOf(fArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Vd(@NotNull T[] tArr, R r2, @NotNull XA0<? super Integer, ? super T, ? super R, ? extends R> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int Fe = Fe(tArr); Fe >= 0; Fe--) {
            r2 = xa0.P(Integer.valueOf(Fe), tArr[Fe], r2);
        }
        return r2;
    }

    @Nullable
    public static final Float Ve(@NotNull float[] fArr, int i2) {
        C6562gT0.p(fArr, "<this>");
        if (i2 >= 0 && i2 < fArr.length) {
            return Float.valueOf(fArr[i2]);
        }
        return null;
    }

    public static final int Vf(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(Byte.valueOf(bArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A Vg(@NotNull short[] sArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Short, ? extends CharSequence> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (short s2 : sArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ha0 != null) {
                a2.append(ha0.invoke(Short.valueOf(s2)));
            } else {
                a2.append(String.valueOf((int) s2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static int Vh(@NotNull long[] jArr, long j2) {
        C6562gT0.p(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (j2 == jArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C Vi(@NotNull T[] tArr, @NotNull C c2, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (T t : tArr) {
            R invoke = ha0.invoke(t);
            if (invoke != null) {
                c2.add(invoke);
            }
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R Vj(T[] tArr, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            R invoke = ha0.invoke(tArr[0]);
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    R invoke2 = ha0.invoke(tArr[i2]);
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double Vk(@NotNull Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        int Fe = Fe(dArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                doubleValue = Math.max(doubleValue, dArr[i2].doubleValue());
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Vl(byte[] bArr, HA0<? super Byte, Double> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            double doubleValue = ha0.invoke(Byte.valueOf(bArr[0])).doubleValue();
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Byte.valueOf(bArr[i2])).doubleValue());
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float Vm(short[] sArr, HA0<? super Short, Float> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Short.valueOf(sArr[0])).floatValue();
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Short.valueOf(sArr[i2])).floatValue());
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float Vn(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (fArr.length != 0) {
            float f2 = fArr[0];
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    float f3 = fArr[i2];
                    if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) > 0) {
                        f2 = f3;
                    }
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return f2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final byte Vo(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return Wo(bArr, AbstractC10696xN1.X);
    }

    public static final short Vp(@NotNull short[] sArr, @NotNull XA0<? super Integer, ? super Short, ? super Short, Short> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (sArr.length != 0) {
            short s2 = sArr[0];
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    s2 = xa0.P(Integer.valueOf(i2), Short.valueOf(s2), Short.valueOf(sArr[i2])).shortValue();
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return s2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer Vq(@NotNull int[] iArr, @NotNull VA0<? super Integer, ? super Integer, Integer> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        int De = De(iArr);
        if (De < 0) {
            return null;
        }
        int i2 = iArr[De];
        for (int i3 = De - 1; i3 >= 0; i3--) {
            i2 = va0.i(Integer.valueOf(iArr[i3]), Integer.valueOf(i2)).intValue();
        }
        return Integer.valueOf(i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Vr(double[] dArr, R r2, XA0<? super Integer, ? super R, ? super Double, ? extends R> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (dArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r2);
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Double.valueOf(dArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Vs(@NotNull int[] iArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int De = De(iArr); De > 0; De--) {
            int m2 = abstractC10696xN1.m(De + 1);
            int i2 = iArr[De];
            iArr[De] = iArr[m2];
            iArr[m2] = i2;
        }
    }

    @NotNull
    public static final List<Float> Vt(@NotNull float[] fArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(Float.valueOf(fArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> Vu(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        Integer[] R4 = C4788Ye.R4(iArr);
        C4788Ye.U3(R4);
        return C4788Ye.t(R4);
    }

    @NotNull
    public static final List<Long> Vv(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Long[] S4 = C4788Ye.S4(jArr);
        C4788Ye.h4(S4, comparator);
        return C4788Ye.t(S4);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int Vw(float[] fArr, HA0<? super Float, Integer> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (float f2 : fArr) {
            i2 += ha0.invoke(Float.valueOf(f2)).intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Short> Vx(@NotNull short[] sArr, int i2) {
        C6562gT0.p(sArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = sArr.length;
            if (i2 >= length) {
                return Vy(sArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Short.valueOf(sArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(Short.valueOf(sArr[i3]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> Vy(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length != 1) {
                return fz(sArr);
            }
            return C7979mF.k(Short.valueOf(sArr[0]));
        }
        return C8222nF.H();
    }

    public static final Iterator Vz(int[] iArr) {
        return C9295re.f(iArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> W5(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(bArr.length), 16));
        for (byte b2 : bArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Byte.valueOf(b2));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M W6(@NotNull short[] sArr, @NotNull M m2, @NotNull HA0<? super Short, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (short s2 : sArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Short.valueOf(s2));
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final double W7(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return dArr[2];
    }

    @NotNull
    public static final List<Byte> W8(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return C10662xF.Y5(hz(bArr));
    }

    @NotNull
    public static final List<Short> W9(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (short s2 : sArr) {
            if (z) {
                arrayList.add(Short.valueOf(s2));
            } else if (!ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> WA(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super Boolean, ? super R, ? extends V> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(Boolean.valueOf(zArr[i2]), obj));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> Wa(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            if (!ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    public static int Wb(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C Wc(int[] iArr, C c2, VA0<? super Integer, ? super Integer, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), Integer.valueOf(iArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final <R> R Wd(@NotNull short[] sArr, R r2, @NotNull XA0<? super Integer, ? super Short, ? super R, ? extends R> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int Ge = Ge(sArr); Ge >= 0; Ge--) {
            r2 = xa0.P(Integer.valueOf(Ge), Short.valueOf(sArr[Ge]), r2);
        }
        return r2;
    }

    @Nullable
    public static final Integer We(@NotNull int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        if (i2 >= 0 && i2 < iArr.length) {
            return Integer.valueOf(iArr[i2]);
        }
        return null;
    }

    public static final int Wf(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(Character.valueOf(cArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <A extends Appendable> A Wg(@NotNull boolean[] zArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Boolean, ? extends CharSequence> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(a2, H.a.b);
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (boolean z : zArr) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (ha0 != null) {
                a2.append(ha0.invoke(Boolean.valueOf(z)));
            } else {
                a2.append(String.valueOf(z));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T> int Wh(@NotNull T[] tArr, T t) {
        C6562gT0.p(tArr, "<this>");
        if (t == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (C6562gT0.g(t, tArr[length2])) {
                        return length2;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Wi(@NotNull byte[] bArr, @NotNull C c2, @NotNull HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (byte b2 : bArr) {
            c2.add(ha0.invoke(Byte.valueOf(b2)));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Wj(short[] sArr, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            R invoke = ha0.invoke(Short.valueOf(sArr[0]));
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    R invoke2 = ha0.invoke(Short.valueOf(sArr[i2]));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float Wk(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                f2 = Math.max(f2, fArr[i2]);
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Wl(char[] cArr, HA0<? super Character, Double> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            double doubleValue = ha0.invoke(Character.valueOf(cArr[0])).doubleValue();
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Character.valueOf(cArr[i2])).doubleValue());
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float Wm(boolean[] zArr, HA0<? super Boolean, Float> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                floatValue = Math.min(floatValue, ha0.invoke(Boolean.valueOf(zArr[i2])).floatValue());
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final int Wn(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int De = De(iArr);
            int i3 = 1;
            if (1 <= De) {
                while (true) {
                    int i4 = iArr[i3];
                    if (comparator.compare(Integer.valueOf(i2), Integer.valueOf(i4)) > 0) {
                        i2 = i4;
                    }
                    if (i3 == De) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.3")
    public static final byte Wo(@NotNull byte[] bArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (bArr.length != 0) {
            return bArr[abstractC10696xN1.m(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final boolean Wp(@NotNull boolean[] zArr, @NotNull XA0<? super Integer, ? super Boolean, ? super Boolean, Boolean> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    z = xa0.P(Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(zArr[i2])).booleanValue();
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return z;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long Wq(@NotNull long[] jArr, @NotNull VA0<? super Long, ? super Long, Long> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Ee = Ee(jArr);
        if (Ee < 0) {
            return null;
        }
        long j2 = jArr[Ee];
        for (int i2 = Ee - 1; i2 >= 0; i2--) {
            j2 = va0.i(Long.valueOf(jArr[i2]), Long.valueOf(j2)).longValue();
        }
        return Long.valueOf(j2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Wr(float[] fArr, R r2, XA0<? super Integer, ? super R, ? super Float, ? extends R> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (fArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r2);
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Float.valueOf(fArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Ws(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        Xs(jArr, AbstractC10696xN1.X);
    }

    @NotNull
    public static final List<Float> Wt(@NotNull float[] fArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.q(C4788Ye.i1(fArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @NotNull
    public static final List<Long> Wu(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        Long[] S4 = C4788Ye.S4(jArr);
        C4788Ye.U3(S4);
        return C4788Ye.t(S4);
    }

    @NotNull
    public static final <T> List<T> Wv(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        return C4788Ye.t(pv(tArr, comparator));
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int Ww(int[] iArr, HA0<? super Integer, Integer> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += ha0.invoke(Integer.valueOf(i3)).intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Boolean> Wx(@NotNull boolean[] zArr, int i2) {
        C6562gT0.p(zArr, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return C8222nF.H();
            }
            int length = zArr.length;
            if (i2 >= length) {
                return Wy(zArr);
            }
            if (i2 == 1) {
                return C7979mF.k(Boolean.valueOf(zArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(Boolean.valueOf(zArr[i3]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> Wy(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                return gz(zArr);
            }
            return C7979mF.k(Boolean.valueOf(zArr[0]));
        }
        return C8222nF.H();
    }

    public static final Iterator Wz(long[] jArr) {
        return C9295re.g(jArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> X5(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(cArr.length), 16));
        for (char c2 : cArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Character.valueOf(c2));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M X6(@NotNull boolean[] zArr, @NotNull M m2, @NotNull HA0<? super Boolean, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "transform");
        for (boolean z : zArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Boolean.valueOf(z));
            m2.put(invoke.e(), invoke.f());
        }
        return m2;
    }

    @XP0
    public static final float X7(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return fArr[2];
    }

    @NotNull
    public static final List<Character> X8(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return C10662xF.Y5(iz(cArr));
    }

    @NotNull
    public static final List<Boolean> X9(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (boolean z2 : zArr) {
            if (z) {
                arrayList.add(Boolean.valueOf(z2));
            } else if (!ha0.invoke(Boolean.valueOf(z2)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<C4180Rx1<Boolean, R>> XA(@NotNull boolean[] zArr, @NotNull R[] rArr) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            boolean z = zArr[i2];
            arrayList.add(C6670gv2.a(Boolean.valueOf(z), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> Xa(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (!ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    public static final int Xb(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                return i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C Xc(long[] jArr, C c2, VA0<? super Integer, ? super Long, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), Long.valueOf(jArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final <R> R Xd(@NotNull boolean[] zArr, R r2, @NotNull XA0<? super Integer, ? super Boolean, ? super R, ? extends R> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        for (int He = He(zArr); He >= 0; He--) {
            r2 = xa0.P(Integer.valueOf(He), Boolean.valueOf(zArr[He]), r2);
        }
        return r2;
    }

    @Nullable
    public static final Long Xe(@NotNull long[] jArr, int i2) {
        C6562gT0.p(jArr, "<this>");
        if (i2 >= 0 && i2 < jArr.length) {
            return Long.valueOf(jArr[i2]);
        }
        return null;
    }

    public static final int Xf(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(Double.valueOf(dArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Xg(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Og(bArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    public static int Xh(@NotNull short[] sArr, short s2) {
        C6562gT0.p(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (s2 == sArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Xi(@NotNull char[] cArr, @NotNull C c2, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (char c3 : cArr) {
            c2.add(ha0.invoke(Character.valueOf(c3)));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Xj(boolean[] zArr, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            R invoke = ha0.invoke(Boolean.valueOf(zArr[0]));
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    R invoke2 = ha0.invoke(Boolean.valueOf(zArr[i2]));
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                    }
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float Xk(@NotNull Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        int Fe = Fe(fArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                floatValue = Math.max(floatValue, fArr[i2].floatValue());
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Xl(double[] dArr, HA0<? super Double, Double> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            double doubleValue = ha0.invoke(Double.valueOf(dArr[0])).doubleValue();
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Double.valueOf(dArr[i2])).doubleValue());
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Xm(byte[] bArr, Comparator<? super R> comparator, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            Object obj = (R) ha0.invoke(Byte.valueOf(bArr[0]));
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    R invoke = ha0.invoke(Byte.valueOf(bArr[i2]));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final long Xn(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (jArr.length != 0) {
            long j2 = jArr[0];
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    long j3 = jArr[i2];
                    if (comparator.compare(Long.valueOf(j2), Long.valueOf(j3)) > 0) {
                        j2 = j3;
                    }
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return j2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final char Xo(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return Yo(cArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Boolean Xp(@NotNull boolean[] zArr, @NotNull XA0<? super Integer, ? super Boolean, ? super Boolean, Boolean> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                z = xa0.P(Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(zArr[i2])).booleanValue();
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S Xq(@NotNull T[] tArr, @NotNull VA0<? super T, ? super S, ? extends S> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Fe = Fe(tArr);
        if (Fe < 0) {
            return null;
        }
        Object obj = (S) tArr[Fe];
        for (int i2 = Fe - 1; i2 >= 0; i2--) {
            obj = (S) va0.i((Object) tArr[i2], obj);
        }
        return (S) obj;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Xr(int[] iArr, R r2, XA0<? super Integer, ? super R, ? super Integer, ? extends R> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (iArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r2);
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Integer.valueOf(iArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void Xs(@NotNull long[] jArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int Ee = Ee(jArr); Ee > 0; Ee--) {
            int m2 = abstractC10696xN1.m(Ee + 1);
            long j2 = jArr[Ee];
            jArr[Ee] = jArr[m2];
            jArr[m2] = j2;
        }
    }

    @NotNull
    public static final List<Integer> Xt(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(Integer.valueOf(iArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> Xu(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return C4788Ye.t(fv(tArr));
    }

    @NotNull
    public static final List<Short> Xv(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Short[] T4 = C4788Ye.T4(sArr);
        C4788Ye.h4(T4, comparator);
        return C4788Ye.t(T4);
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int Xw(long[] jArr, HA0<? super Long, Integer> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (long j2 : jArr) {
            i2 += ha0.invoke(Long.valueOf(j2)).intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Byte> Xx(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int ze = ze(bArr); -1 < ze; ze--) {
            if (!ha0.invoke(Byte.valueOf(bArr[ze])).booleanValue()) {
                return o9(bArr, ze + 1);
            }
        }
        return Oy(bArr);
    }

    @NotNull
    public static final long[] Xy(@NotNull Long[] lArr) {
        C6562gT0.p(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = lArr[i2].longValue();
        }
        return jArr;
    }

    public static final Iterator Xz(float[] fArr) {
        return C9295re.e(fArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> Y5(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(dArr.length), 16));
        for (double d2 : dArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Double.valueOf(d2));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> Map<Byte, V> Y6(byte[] bArr, HA0<? super Byte, ? extends V> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(bArr.length), 16));
        for (byte b2 : bArr) {
            linkedHashMap.put(Byte.valueOf(b2), ha0.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    @XP0
    public static final int Y7(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return iArr[2];
    }

    @NotNull
    public static final List<Double> Y8(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return C10662xF.Y5(jz(dArr));
    }

    @XP0
    public static final byte Y9(byte[] bArr, int i2, HA0<? super Integer, Byte> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < bArr.length) {
            return bArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).byteValue();
    }

    @NotNull
    public static final <R, V> List<V> YA(@NotNull boolean[] zArr, @NotNull R[] rArr, @NotNull VA0<? super Boolean, ? super R, ? extends V> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Boolean.valueOf(zArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> Ya(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (!ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        return arrayList;
    }

    public static long Yb(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C Yc(T[] tArr, C c2, VA0<? super Integer, ? super T, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final void Yd(@NotNull byte[] bArr, @NotNull HA0<? super Byte, C7458kA2> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (byte b2 : bArr) {
            ha0.invoke(Byte.valueOf(b2));
        }
    }

    @Nullable
    public static <T> T Ye(@NotNull T[] tArr, int i2) {
        C6562gT0.p(tArr, "<this>");
        if (i2 >= 0 && i2 < tArr.length) {
            return tArr[i2];
        }
        return null;
    }

    public static final int Yf(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Yg(char[] cArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Pg(cArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    public static final int Yh(@NotNull boolean[] zArr, boolean z) {
        C6562gT0.p(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (z == zArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Yi(@NotNull double[] dArr, @NotNull C c2, @NotNull HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (double d2 : dArr) {
            c2.add(ha0.invoke(Double.valueOf(d2)));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Yj(byte[] bArr, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Byte.valueOf(bArr[0]));
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                R invoke2 = ha0.invoke(Byte.valueOf(bArr[i2]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer Yk(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int De = De(iArr);
        int i3 = 1;
        if (1 <= De) {
            while (true) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    i2 = i4;
                }
                if (i3 == De) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Yl(float[] fArr, HA0<? super Float, Double> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            double doubleValue = ha0.invoke(Float.valueOf(fArr[0])).doubleValue();
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Float.valueOf(fArr[i2])).doubleValue());
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Ym(char[] cArr, Comparator<? super R> comparator, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            Object obj = (R) ha0.invoke(Character.valueOf(cArr[0]));
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    R invoke = ha0.invoke(Character.valueOf(cArr[i2]));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T> T Yn(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (tArr.length != 0) {
            T t = tArr[0];
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    T t2 = tArr[i2];
                    if (comparator.compare(t, t2) > 0) {
                        t = t2;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.3")
    public static final char Yo(@NotNull char[] cArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (cArr.length != 0) {
            return cArr[abstractC10696xN1.m(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte Yp(@NotNull byte[] bArr, @NotNull XA0<? super Integer, ? super Byte, ? super Byte, Byte> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                b2 = xa0.P(Integer.valueOf(i2), Byte.valueOf(b2), Byte.valueOf(bArr[i2])).byteValue();
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Byte.valueOf(b2);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short Yq(@NotNull short[] sArr, @NotNull VA0<? super Short, ? super Short, Short> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Ge = Ge(sArr);
        if (Ge < 0) {
            return null;
        }
        short s2 = sArr[Ge];
        for (int i2 = Ge - 1; i2 >= 0; i2--) {
            s2 = va0.i(Short.valueOf(sArr[i2]), Short.valueOf(s2)).shortValue();
        }
        return Short.valueOf(s2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> Yr(long[] jArr, R r2, XA0<? super Integer, ? super R, ? super Long, ? extends R> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (jArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r2);
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Long.valueOf(jArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final <T> void Ys(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        Zs(tArr, AbstractC10696xN1.X);
    }

    @NotNull
    public static final List<Integer> Yt(@NotNull int[] iArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.r(C4788Ye.j1(iArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @NotNull
    public static final List<Short> Yu(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        Short[] T4 = C4788Ye.T4(sArr);
        C4788Ye.U3(T4);
        return C4788Ye.t(T4);
    }

    @NotNull
    public static final List<Boolean> Yv(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        Boolean[] M4 = C4788Ye.M4(zArr);
        C4788Ye.h4(M4, comparator);
        return C4788Ye.t(M4);
    }

    @InterfaceC8046mW0(name = "sumOfInt")
    public static final int Yw(@NotNull Integer[] numArr) {
        C6562gT0.p(numArr, "<this>");
        int i2 = 0;
        for (Integer num : numArr) {
            i2 += num.intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Character> Yx(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Ae = Ae(cArr); -1 < Ae; Ae--) {
            if (!ha0.invoke(Character.valueOf(cArr[Ae])).booleanValue()) {
                return p9(cArr, Ae + 1);
            }
        }
        return Py(cArr);
    }

    @NotNull
    public static final List<Byte> Yy(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static final Iterator Yz(double[] dArr) {
        return C9295re.d(dArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> Z5(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(fArr.length), 16));
        for (float f2 : fArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Float.valueOf(f2));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> Map<Character, V> Z6(char[] cArr, HA0<? super Character, ? extends V> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(C5075aO1.B(cArr.length, 128)), 16));
        for (char c2 : cArr) {
            linkedHashMap.put(Character.valueOf(c2), ha0.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    @XP0
    public static final long Z7(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return jArr[2];
    }

    @NotNull
    public static final List<Float> Z8(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return C10662xF.Y5(kz(fArr));
    }

    @XP0
    public static final char Z9(char[] cArr, int i2, HA0<? super Integer, Character> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < cArr.length) {
            return cArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).charValue();
    }

    @NotNull
    public static final List<C4180Rx1<Boolean, Boolean>> ZA(@NotNull boolean[] zArr, @NotNull boolean[] zArr2) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(zArr2, "other");
        int min = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(Boolean.valueOf(zArr[i2]), Boolean.valueOf(zArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> Za(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (!ha0.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final long Zb(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                return j2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C Zc(short[] sArr, C c2, VA0<? super Integer, ? super Short, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), Short.valueOf(sArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final void Zd(@NotNull char[] cArr, @NotNull HA0<? super Character, C7458kA2> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (char c2 : cArr) {
            ha0.invoke(Character.valueOf(c2));
        }
    }

    @Nullable
    public static final Short Ze(@NotNull short[] sArr, int i2) {
        C6562gT0.p(sArr, "<this>");
        if (i2 >= 0 && i2 < sArr.length) {
            return Short.valueOf(sArr[i2]);
        }
        return null;
    }

    public static final int Zf(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable Zg(double[] dArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Qg(dArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    @Nullable
    public static final Boolean Zh(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C Zi(@NotNull float[] fArr, @NotNull C c2, @NotNull HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (float f2 : fArr) {
            c2.add(ha0.invoke(Float.valueOf(f2)));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R Zj(char[] cArr, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Character.valueOf(cArr[0]));
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                R invoke2 = ha0.invoke(Character.valueOf(cArr[i2]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long Zk(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                long j3 = jArr[i2];
                if (j2 < j3) {
                    j2 = j3;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Long.valueOf(j2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double Zl(int[] iArr, HA0<? super Integer, Double> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            double doubleValue = ha0.invoke(Integer.valueOf(iArr[0])).doubleValue();
            int De = De(iArr);
            int i2 = 1;
            if (1 <= De) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Integer.valueOf(iArr[i2])).doubleValue());
                    if (i2 == De) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R Zm(double[] dArr, Comparator<? super R> comparator, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            Object obj = (R) ha0.invoke(Double.valueOf(dArr[0]));
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    R invoke = ha0.invoke(Double.valueOf(dArr[i2]));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final short Zn(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (sArr.length != 0) {
            short s2 = sArr[0];
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    short s3 = sArr[i2];
                    if (comparator.compare(Short.valueOf(s2), Short.valueOf(s3)) > 0) {
                        s2 = s3;
                    }
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return s2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final double Zo(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return ap(dArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character Zp(@NotNull char[] cArr, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                c2 = xa0.P(Integer.valueOf(i2), Character.valueOf(c2), Character.valueOf(cArr[i2])).charValue();
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Character.valueOf(c2);
    }

    @NotNull
    public static final <T> T[] Zq(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        for (T t : tArr) {
            if (t == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T, R> List<R> Zr(@NotNull T[] tArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super T, ? extends R> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (tArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r2);
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, tArr[i2]);
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final <T> void Zs(@NotNull T[] tArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int Fe = Fe(tArr); Fe > 0; Fe--) {
            int m2 = abstractC10696xN1.m(Fe + 1);
            T t = tArr[Fe];
            tArr[Fe] = tArr[m2];
            tArr[m2] = t;
        }
    }

    @NotNull
    public static final List<Long> Zt(@NotNull long[] jArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(Long.valueOf(jArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final byte[] Zu(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.G3(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Byte> Zv(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Byte> hz = hz(bArr);
        C9444sF.H0(hz, iterable);
        return hz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> int Zw(T[] tArr, HA0<? super T, Integer> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (T t : tArr) {
            i2 += ha0.invoke(t).intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Double> Zx(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Be = Be(dArr); -1 < Be; Be--) {
            if (!ha0.invoke(Double.valueOf(dArr[Be])).booleanValue()) {
                return q9(dArr, Be + 1);
            }
        }
        return Qy(dArr);
    }

    @NotNull
    public static final List<Character> Zy(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c2 : cArr) {
            arrayList.add(Character.valueOf(c2));
        }
        return arrayList;
    }

    public static final Iterator Zz(boolean[] zArr) {
        return C9295re.a(zArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> a6(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(iArr.length), 16));
        for (int i2 : iArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Integer.valueOf(i2));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> Map<Double, V> a7(double[] dArr, HA0<? super Double, ? extends V> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(dArr.length), 16));
        for (double d2 : dArr) {
            linkedHashMap.put(Double.valueOf(d2), ha0.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @XP0
    public static final <T> T a8(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return tArr[2];
    }

    @NotNull
    public static final List<Integer> a9(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return C10662xF.Y5(lz(iArr));
    }

    public static final Iterator aA(char[] cArr) {
        return C9295re.c(cArr);
    }

    @NotNull
    public static final <V> List<V> aB(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, @NotNull VA0<? super Boolean, ? super Boolean, ? extends V> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(zArr2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Boolean.valueOf(zArr[i2]), Boolean.valueOf(zArr2[i2])));
        }
        return arrayList;
    }

    @XP0
    public static final double aa(double[] dArr, int i2, HA0<? super Integer, Double> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < dArr.length) {
            return dArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).doubleValue();
    }

    @NotNull
    public static final List<Short> ab(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            if (!ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
            }
        }
        return arrayList;
    }

    public static final <T> T ac(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedIterableTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R, C extends Collection<? super R>> C ad(boolean[] zArr, C c2, VA0<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.q0(c2, va0.i(Integer.valueOf(i3), Boolean.valueOf(zArr[i2])));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final void ae(@NotNull double[] dArr, @NotNull HA0<? super Double, C7458kA2> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (double d2 : dArr) {
            ha0.invoke(Double.valueOf(d2));
        }
    }

    @NotNull
    public static final <K> Map<K, List<Byte>> af(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends K> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b2 : bArr) {
            K invoke = ha0.invoke(Byte.valueOf(b2));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Byte.valueOf(b2));
        }
        return linkedHashMap;
    }

    public static final int ag(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(Long.valueOf(jArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable ah(float[] fArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Rg(fArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    @Nullable
    public static final Boolean ai(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            boolean z = zArr[length];
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C aj(@NotNull int[] iArr, @NotNull C c2, @NotNull HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (int i2 : iArr) {
            c2.add(ha0.invoke(Integer.valueOf(i2)));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R ak(double[] dArr, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Double.valueOf(dArr[0]));
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                R invoke2 = ha0.invoke(Double.valueOf(dArr[i2]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short al(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                short s3 = sArr[i2];
                if (s2 < s3) {
                    s2 = s3;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Short.valueOf(s2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double am(long[] jArr, HA0<? super Long, Double> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            double doubleValue = ha0.invoke(Long.valueOf(jArr[0])).doubleValue();
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Long.valueOf(jArr[i2])).doubleValue());
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R an(float[] fArr, Comparator<? super R> comparator, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            Object obj = (R) ha0.invoke(Float.valueOf(fArr[0]));
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    R invoke = ha0.invoke(Float.valueOf(fArr[i2]));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "minWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final boolean ao(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    boolean z2 = zArr[i2];
                    if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) > 0) {
                        z = z2;
                    }
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return z;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.3")
    public static final double ap(@NotNull double[] dArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (dArr.length != 0) {
            return dArr[abstractC10696xN1.m(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double aq(@NotNull double[] dArr, @NotNull XA0<? super Integer, ? super Double, ? super Double, Double> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                d2 = xa0.P(Integer.valueOf(i2), Double.valueOf(d2), Double.valueOf(dArr[i2])).doubleValue();
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(d2);
    }

    public static void ar(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length >= 0) {
            int ze = ze(bArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    byte b2 = bArr[i2];
                    bArr[i2] = bArr[ze];
                    bArr[ze] = b2;
                    ze--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> as(short[] sArr, R r2, XA0<? super Integer, ? super R, ? super Short, ? extends R> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (sArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r2);
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Short.valueOf(sArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void at(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        bt(sArr, AbstractC10696xN1.X);
    }

    @NotNull
    public static final List<Long> au(@NotNull long[] jArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.s(C4788Ye.k1(jArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @NotNull
    public static final char[] av(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.I3(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Character> aw(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Character> iz = iz(cArr);
        C9444sF.H0(iz, iterable);
        return iz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int ax(short[] sArr, HA0<? super Short, Integer> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (short s2 : sArr) {
            i2 += ha0.invoke(Short.valueOf(s2)).intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Float> ay(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Ce = Ce(fArr); -1 < Ce; Ce--) {
            if (!ha0.invoke(Float.valueOf(fArr[Ce])).booleanValue()) {
                return r9(fArr, Ce + 1);
            }
        }
        return Ry(fArr);
    }

    @NotNull
    public static final List<Double> az(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d2 : dArr) {
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> b6(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(jArr.length), 16));
        for (long j2 : jArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Long.valueOf(j2));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> Map<Float, V> b7(float[] fArr, HA0<? super Float, ? extends V> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(fArr.length), 16));
        for (float f2 : fArr) {
            linkedHashMap.put(Float.valueOf(f2), ha0.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    @XP0
    public static final short b8(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return sArr[2];
    }

    @NotNull
    public static final List<Long> b9(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return C10662xF.Y5(mz(jArr));
    }

    @NotNull
    public static final <R> List<C4180Rx1<Byte, R>> bA(@NotNull byte[] bArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(Byte.valueOf(bArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @XP0
    public static final float ba(float[] fArr, int i2, HA0<? super Integer, Float> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < fArr.length) {
            return fArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).floatValue();
    }

    @NotNull
    public static final List<Boolean> bb(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (!ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    public static final <T> T bc(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedSequence")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> List<R> bd(T[] tArr, VA0<? super Integer, ? super T, ? extends B02<? extends R>> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.r0(arrayList, va0.i(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final void be(@NotNull float[] fArr, @NotNull HA0<? super Float, C7458kA2> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (float f2 : fArr) {
            ha0.invoke(Float.valueOf(f2));
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> bf(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends K> ha0, @NotNull HA0<? super Byte, ? extends V> ha02) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b2 : bArr) {
            K invoke = ha0.invoke(Byte.valueOf(b2));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    public static final <T> int bg(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(tArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable bh(int[] iArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Sg(iArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    @Nullable
    public static final Byte bi(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C bj(@NotNull long[] jArr, @NotNull C c2, @NotNull HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (long j2 : jArr) {
            c2.add(ha0.invoke(Long.valueOf(j2)));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R bk(float[] fArr, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Float.valueOf(fArr[0]));
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                R invoke2 = ha0.invoke(Float.valueOf(fArr[i2]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final byte bl(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length != 0) {
            byte b2 = bArr[0];
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    byte b3 = bArr[i2];
                    if (b2 < b3) {
                        b2 = b3;
                    }
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return b2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> double bm(T[] tArr, HA0<? super T, Double> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            double doubleValue = ha0.invoke(tArr[0]).doubleValue();
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(tArr[i2]).doubleValue());
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R bn(int[] iArr, Comparator<? super R> comparator, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            Object obj = (R) ha0.invoke(Integer.valueOf(iArr[0]));
            int De = De(iArr);
            int i2 = 1;
            if (1 <= De) {
                while (true) {
                    R invoke = ha0.invoke(Integer.valueOf(iArr[i2]));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == De) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean bo(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final float bp(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return cp(fArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float bq(@NotNull float[] fArr, @NotNull XA0<? super Integer, ? super Float, ? super Float, Float> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                f2 = xa0.P(Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(fArr[i2])).floatValue();
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    @InterfaceC6480g82(version = "1.4")
    public static void br(@NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(bArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, bArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                bArr[i2] = bArr[i5];
                bArr[i5] = b2;
                i5--;
                i2++;
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> bs(boolean[] zArr, R r2, XA0<? super Integer, ? super R, ? super Boolean, ? extends R> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (zArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r2);
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = xa0.P(Integer.valueOf(i2), r2, Boolean.valueOf(zArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void bt(@NotNull short[] sArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int Ge = Ge(sArr); Ge > 0; Ge--) {
            int m2 = abstractC10696xN1.m(Ge + 1);
            short s2 = sArr[Ge];
            sArr[Ge] = sArr[m2];
            sArr[m2] = s2;
        }
    }

    @NotNull
    public static final <T> List<T> bu(@NotNull T[] tArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(tArr[num.intValue()]);
        }
        return arrayList;
    }

    @NotNull
    public static final double[] bv(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.K3(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Double> bw(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Double> jz = jz(dArr);
        C9444sF.H0(jz, iterable);
        return jz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final int bx(boolean[] zArr, HA0<? super Boolean, Integer> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (boolean z : zArr) {
            i2 += ha0.invoke(Boolean.valueOf(z)).intValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Float> bz(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, V> c6(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(tArr.length), 16));
        for (Manifest manifest : tArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(manifest);
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> Map<Integer, V> c7(int[] iArr, HA0<? super Integer, ? extends V> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(iArr.length), 16));
        for (int i2 : iArr) {
            linkedHashMap.put(Integer.valueOf(i2), ha0.invoke(Integer.valueOf(i2)));
        }
        return linkedHashMap;
    }

    @XP0
    public static final boolean c8(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return zArr[2];
    }

    @NotNull
    public static final <T> List<T> c9(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return C10662xF.Y5(nz(tArr));
    }

    @NotNull
    public static final <R, V> List<V> cA(@NotNull byte[] bArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super Byte, ? super R, ? extends V> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(Byte.valueOf(bArr[i2]), obj));
            i2++;
        }
        return arrayList;
    }

    @XP0
    public static final int ca(int[] iArr, int i2, HA0<? super Integer, Integer> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).intValue();
    }

    @NotNull
    public static <T> List<T> cb(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return (List) db(tArr, new ArrayList());
    }

    public static short cc(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @XP0
    @InterfaceC8046mW0(name = "flatMapIndexedSequenceTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C cd(T[] tArr, C c2, VA0<? super Integer, ? super T, ? extends B02<? extends R>> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(va0, "transform");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C9444sF.r0(c2, va0.i(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return c2;
    }

    public static final void ce(@NotNull int[] iArr, @NotNull HA0<? super Integer, C7458kA2> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (int i2 : iArr) {
            ha0.invoke(Integer.valueOf(i2));
        }
    }

    @NotNull
    public static final <K> Map<K, List<Character>> cf(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c2 : cArr) {
            K invoke = ha0.invoke(Character.valueOf(c2));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(c2));
        }
        return linkedHashMap;
    }

    public static final int cg(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(Short.valueOf(sArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable ch(long[] jArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Tg(jArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    @Nullable
    public static final Byte ci(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            byte b2 = bArr[length];
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C cj(@NotNull T[] tArr, @NotNull C c2, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (T t : tArr) {
            c2.add(ha0.invoke(t));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R ck(int[] iArr, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Integer.valueOf(iArr[0]));
        int De = De(iArr);
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                R invoke2 = ha0.invoke(Integer.valueOf(iArr[i2]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final char cl(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length != 0) {
            char c2 = cArr[0];
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    char c3 = cArr[i2];
                    if (C6562gT0.t(c2, c3) < 0) {
                        c2 = c3;
                    }
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return c2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double cm(short[] sArr, HA0<? super Short, Double> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            double doubleValue = ha0.invoke(Short.valueOf(sArr[0])).doubleValue();
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Short.valueOf(sArr[i2])).doubleValue());
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R cn(long[] jArr, Comparator<? super R> comparator, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            Object obj = (R) ha0.invoke(Long.valueOf(jArr[0]));
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    R invoke = ha0.invoke(Long.valueOf(jArr[i2]));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean co(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6480g82(version = "1.3")
    public static final float cp(@NotNull float[] fArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (fArr.length != 0) {
            return fArr[abstractC10696xN1.m(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer cq(@NotNull int[] iArr, @NotNull XA0<? super Integer, ? super Integer, ? super Integer, Integer> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int De = De(iArr);
        int i3 = 1;
        if (1 <= De) {
            while (true) {
                i2 = xa0.P(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(iArr[i3])).intValue();
                if (i3 == De) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    public static final void cr(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length >= 0) {
            int Ae = Ae(cArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    char c2 = cArr[i2];
                    cArr[i2] = cArr[Ae];
                    cArr[Ae] = c2;
                    Ae--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Byte> cs(byte[] bArr, VA0<? super Byte, ? super Byte, Byte> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (bArr.length == 0) {
            return C8222nF.H();
        }
        byte b2 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b2));
        int length = bArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            b2 = va0.i(Byte.valueOf(b2), Byte.valueOf(bArr[i2])).byteValue();
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void ct(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        dt(zArr, AbstractC10696xN1.X);
    }

    @NotNull
    public static final <T> List<T> cu(@NotNull T[] tArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.t(C4788Ye.l1(tArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @NotNull
    public static final float[] cv(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.M3(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Float> cw(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Float> kz = kz(fArr);
        C9444sF.H0(kz, iterable);
        return kz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long cx(byte[] bArr, HA0<? super Byte, Long> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (byte b2 : bArr) {
            j2 += ha0.invoke(Byte.valueOf(b2)).longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Integer> cy(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int De = De(iArr); -1 < De; De--) {
            if (!ha0.invoke(Integer.valueOf(iArr[De])).booleanValue()) {
                return s9(iArr, De + 1);
            }
        }
        return Sy(iArr);
    }

    @NotNull
    public static final List<Integer> cz(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static final boolean d5(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (byte b2 : bArr) {
            if (!ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> d6(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(sArr.length), 16));
        for (short s2 : sArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Short.valueOf(s2));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> Map<Long, V> d7(long[] jArr, HA0<? super Long, ? extends V> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(jArr.length), 16));
        for (long j2 : jArr) {
            linkedHashMap.put(Long.valueOf(j2), ha0.invoke(Long.valueOf(j2)));
        }
        return linkedHashMap;
    }

    @XP0
    public static final byte d8(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return bArr[3];
    }

    @NotNull
    public static final List<Short> d9(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return C10662xF.Y5(oz(sArr));
    }

    @NotNull
    public static final List<C4180Rx1<Byte, Byte>> dA(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(bArr2, "other");
        int min = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(Byte.valueOf(bArr[i2]), Byte.valueOf(bArr2[i2])));
        }
        return arrayList;
    }

    @XP0
    public static final long da(long[] jArr, int i2, HA0<? super Integer, Long> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < jArr.length) {
            return jArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).longValue();
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C db(@NotNull T[] tArr, @NotNull C c2) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (T t : tArr) {
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    public static final short dc(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                return s2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapSequence")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> List<R> dd(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends B02<? extends R>> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            C9444sF.r0(arrayList, ha0.invoke(t));
        }
        return arrayList;
    }

    public static final void de(@NotNull long[] jArr, @NotNull HA0<? super Long, C7458kA2> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (long j2 : jArr) {
            ha0.invoke(Long.valueOf(j2));
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> df(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends K> ha0, @NotNull HA0<? super Character, ? extends V> ha02) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c2 : cArr) {
            K invoke = ha0.invoke(Character.valueOf(c2));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    public static final int dg(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ha0.invoke(Boolean.valueOf(zArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable dh(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Ug(objArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    @Nullable
    public static final Character di(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C dj(@NotNull short[] sArr, @NotNull C c2, @NotNull HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (short s2 : sArr) {
            c2.add(ha0.invoke(Short.valueOf(s2)));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R dk(long[] jArr, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Long.valueOf(jArr[0]));
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                R invoke2 = ha0.invoke(Long.valueOf(jArr[i2]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double dl(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    d2 = Math.max(d2, dArr[i2]);
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double dm(boolean[] zArr, HA0<? super Boolean, Double> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            double doubleValue = ha0.invoke(Boolean.valueOf(zArr[0])).doubleValue();
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    doubleValue = Math.min(doubleValue, ha0.invoke(Boolean.valueOf(zArr[i2])).doubleValue());
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R dn(T[] tArr, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            Object obj = (R) ha0.invoke(tArr[0]);
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    R invoke = ha0.invoke(tArr[i2]);
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final int dp(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return ep(iArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long dq(@NotNull long[] jArr, @NotNull XA0<? super Integer, ? super Long, ? super Long, Long> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                j2 = xa0.P(Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(jArr[i2])).longValue();
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Long.valueOf(j2);
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void dr(@NotNull char[] cArr, int i2, int i3) {
        C6562gT0.p(cArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, cArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                char c2 = cArr[i2];
                cArr[i2] = cArr[i5];
                cArr[i5] = c2;
                i5--;
                i2++;
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Character> ds(char[] cArr, VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (cArr.length == 0) {
            return C8222nF.H();
        }
        char c2 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c2));
        int length = cArr.length;
        int i2 = 1;
        while (i2 < length) {
            Character i3 = va0.i(Character.valueOf(c2), Character.valueOf(cArr[i2]));
            char charValue = i3.charValue();
            arrayList.add(i3);
            i2++;
            c2 = charValue;
        }
        return arrayList;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void dt(@NotNull boolean[] zArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        for (int He = He(zArr); He > 0; He--) {
            int m2 = abstractC10696xN1.m(He + 1);
            boolean z = zArr[He];
            zArr[He] = zArr[m2];
            zArr[m2] = z;
        }
    }

    @NotNull
    public static final List<Short> du(@NotNull short[] sArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(Short.valueOf(sArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final int[] dv(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.O3(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Integer> dw(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Integer> lz = lz(iArr);
        C9444sF.H0(lz, iterable);
        return lz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long dx(char[] cArr, HA0<? super Character, Long> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (char c2 : cArr) {
            j2 += ha0.invoke(Character.valueOf(c2)).longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Long> dy(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Ee = Ee(jArr); -1 < Ee; Ee--) {
            if (!ha0.invoke(Long.valueOf(jArr[Ee])).booleanValue()) {
                return t9(jArr, Ee + 1);
            }
        }
        return Ty(jArr);
    }

    @NotNull
    public static final List<Long> dz(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static final boolean e5(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (char c2 : cArr) {
            if (!ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> e6(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends C4180Rx1<? extends K, ? extends V>> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(zArr.length), 16));
        for (boolean z : zArr) {
            C4180Rx1<? extends K, ? extends V> invoke = ha0.invoke(Boolean.valueOf(z));
            linkedHashMap.put(invoke.e(), invoke.f());
        }
        return linkedHashMap;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <K, V> Map<K, V> e7(@NotNull K[] kArr, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(kArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(kArr.length), 16));
        for (K k2 : kArr) {
            linkedHashMap.put(k2, ha0.invoke(k2));
        }
        return linkedHashMap;
    }

    @XP0
    public static final char e8(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return cArr[3];
    }

    @NotNull
    public static final List<Boolean> e9(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return C10662xF.Y5(pz(zArr));
    }

    @NotNull
    public static final <V> List<V> eA(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull VA0<? super Byte, ? super Byte, ? extends V> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(bArr2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Byte.valueOf(bArr[i2]), Byte.valueOf(bArr2[i2])));
        }
        return arrayList;
    }

    @XP0
    public static final <T> T ea(T[] tArr, int i2, HA0<? super Integer, ? extends T> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < tArr.length) {
            return tArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2));
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C eb(@NotNull byte[] bArr, @NotNull C c2, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (byte b2 : bArr) {
            if (!ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                c2.add(Byte.valueOf(b2));
            }
        }
        return c2;
    }

    public static final boolean ec(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    @InterfaceC8046mW0(name = "flatMapSequenceTo")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C ed(@NotNull T[] tArr, @NotNull C c2, @NotNull HA0<? super T, ? extends B02<? extends R>> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (T t : tArr) {
            C9444sF.r0(c2, ha0.invoke(t));
        }
        return c2;
    }

    public static final <T> void ee(@NotNull T[] tArr, @NotNull HA0<? super T, C7458kA2> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (T t : tArr) {
            ha0.invoke(t);
        }
    }

    @NotNull
    public static final <K> Map<K, List<Double>> ef(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends K> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d2 : dArr) {
            K invoke = ha0.invoke(Double.valueOf(d2));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Double.valueOf(d2));
        }
        return linkedHashMap;
    }

    public static final int eg(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable eh(short[] sArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Vg(sArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    @Nullable
    public static final Character ei(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            char c2 = cArr[length];
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C ej(@NotNull boolean[] zArr, @NotNull C c2, @NotNull HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (boolean z : zArr) {
            c2.add(ha0.invoke(Boolean.valueOf(z)));
        }
        return c2;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R ek(T[] tArr, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(tArr[0]);
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                R invoke2 = ha0.invoke(tArr[i2]);
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double el(@NotNull Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length != 0) {
            double doubleValue = dArr[0].doubleValue();
            int Fe = Fe(dArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    doubleValue = Math.max(doubleValue, dArr[i2].doubleValue());
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float em(byte[] bArr, HA0<? super Byte, Float> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            float floatValue = ha0.invoke(Byte.valueOf(bArr[0])).floatValue();
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Byte.valueOf(bArr[i2])).floatValue());
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R en(short[] sArr, Comparator<? super R> comparator, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            Object obj = (R) ha0.invoke(Short.valueOf(sArr[0]));
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    R invoke = ha0.invoke(Short.valueOf(sArr[i2]));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean eo(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.3")
    public static final int ep(@NotNull int[] iArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (iArr.length != 0) {
            return iArr[abstractC10696xN1.m(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S eq(@NotNull T[] tArr, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s2 = (Object) tArr[0];
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                s2 = xa0.P(Integer.valueOf(i2), s2, (Object) tArr[i2]);
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return (S) s2;
    }

    public static final void er(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length >= 0) {
            int Be = Be(dArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    double d2 = dArr[i2];
                    dArr[i2] = dArr[Be];
                    dArr[Be] = d2;
                    Be--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Double> es(double[] dArr, VA0<? super Double, ? super Double, Double> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (dArr.length == 0) {
            return C8222nF.H();
        }
        double d2 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d2));
        int length = dArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            d2 = va0.i(Double.valueOf(d2), Double.valueOf(dArr[i2])).doubleValue();
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    public static byte et(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length == 1) {
                return bArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Short> eu(@NotNull short[] sArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.u(C4788Ye.m1(sArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @NotNull
    public static final long[] ev(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.Q3(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Long> ew(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Long> mz = mz(jArr);
        C9444sF.H0(mz, iterable);
        return mz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long ex(double[] dArr, HA0<? super Double, Long> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (double d2 : dArr) {
            j2 += ha0.invoke(Double.valueOf(d2)).longValue();
        }
        return j2;
    }

    @NotNull
    public static final <T> List<T> ey(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Fe = Fe(tArr); -1 < Fe; Fe--) {
            if (!ha0.invoke(tArr[Fe]).booleanValue()) {
                return u9(tArr, Fe + 1);
            }
        }
        return Uy(tArr);
    }

    @NotNull
    public static <T> List<T> ez(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return new ArrayList(C8222nF.t(tArr));
    }

    public static final boolean f5(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (double d2 : dArr) {
            if (!ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K> Map<K, Byte> f6(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends K> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(bArr.length), 16));
        for (byte b2 : bArr) {
            linkedHashMap.put(ha0.invoke(Byte.valueOf(b2)), Byte.valueOf(b2));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> Map<Short, V> f7(short[] sArr, HA0<? super Short, ? extends V> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(sArr.length), 16));
        for (short s2 : sArr) {
            linkedHashMap.put(Short.valueOf(s2), ha0.invoke(Short.valueOf(s2)));
        }
        return linkedHashMap;
    }

    @XP0
    public static final double f8(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return dArr[3];
    }

    @NotNull
    public static final <K> List<Byte> f9(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends K> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            if (hashSet.add(ha0.invoke(Byte.valueOf(b2)))) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<C4180Rx1<Byte, R>> fA(@NotNull byte[] bArr, @NotNull R[] rArr) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            byte b2 = bArr[i2];
            arrayList.add(C6670gv2.a(Byte.valueOf(b2), rArr[i2]));
        }
        return arrayList;
    }

    @XP0
    public static final short fa(short[] sArr, int i2, HA0<? super Integer, Short> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < sArr.length) {
            return sArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).shortValue();
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C fb(@NotNull char[] cArr, @NotNull C c2, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (char c3 : cArr) {
            if (!ha0.invoke(Character.valueOf(c3)).booleanValue()) {
                c2.add(Character.valueOf(c3));
            }
        }
        return c2;
    }

    public static final boolean fc(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                return z;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C fd(@NotNull byte[] bArr, @NotNull C c2, @NotNull HA0<? super Byte, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (byte b2 : bArr) {
            C9444sF.q0(c2, ha0.invoke(Byte.valueOf(b2)));
        }
        return c2;
    }

    public static final void fe(@NotNull short[] sArr, @NotNull HA0<? super Short, C7458kA2> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (short s2 : sArr) {
            ha0.invoke(Short.valueOf(s2));
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> ff(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends K> ha0, @NotNull HA0<? super Double, ? extends V> ha02) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d2 : dArr) {
            K invoke = ha0.invoke(Double.valueOf(d2));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    public static final int fg(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable fh(boolean[] zArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        HA0 ha02;
        if ((i3 & 2) != 0) {
            charSequence5 = C6566gU0.h;
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i3 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i3 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i3 & 16) != 0) {
            i4 = -1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i3 & 64) != 0) {
            ha02 = null;
        } else {
            ha02 = ha0;
        }
        return Wg(zArr, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, ha02);
    }

    @Nullable
    public static final Double fi(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean fj(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int He = He(zArr);
        if (He == 0) {
            return Boolean.valueOf(z);
        }
        R invoke = ha0.invoke(Boolean.valueOf(z));
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                boolean z2 = zArr[i2];
                R invoke2 = ha0.invoke(Boolean.valueOf(z2));
                if (invoke.compareTo(invoke2) < 0) {
                    z = z2;
                    invoke = invoke2;
                }
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R fk(short[] sArr, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Short.valueOf(sArr[0]));
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                R invoke2 = ha0.invoke(Short.valueOf(sArr[i2]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float fl(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length != 0) {
            float f2 = fArr[0];
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    f2 = Math.max(f2, fArr[i2]);
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return f2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float fm(char[] cArr, HA0<? super Character, Float> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            float floatValue = ha0.invoke(Character.valueOf(cArr[0])).floatValue();
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Character.valueOf(cArr[i2])).floatValue());
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R fn(boolean[] zArr, Comparator<? super R> comparator, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            Object obj = (R) ha0.invoke(Boolean.valueOf(zArr[0]));
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    R invoke = ha0.invoke(Boolean.valueOf(zArr[i2]));
                    if (comparator.compare(obj, invoke) > 0) {
                        obj = invoke;
                    }
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final boolean fo(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final long fp(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return gp(jArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short fq(@NotNull short[] sArr, @NotNull XA0<? super Integer, ? super Short, ? super Short, Short> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                s2 = xa0.P(Integer.valueOf(i2), Short.valueOf(s2), Short.valueOf(sArr[i2])).shortValue();
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Short.valueOf(s2);
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void fr(@NotNull double[] dArr, int i2, int i3) {
        C6562gT0.p(dArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, dArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                double d2 = dArr[i2];
                dArr[i2] = dArr[i5];
                dArr[i5] = d2;
                i5--;
                i2++;
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Float> fs(float[] fArr, VA0<? super Float, ? super Float, Float> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (fArr.length == 0) {
            return C8222nF.H();
        }
        float f2 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f2));
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            f2 = va0.i(Float.valueOf(f2), Float.valueOf(fArr[i2])).floatValue();
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    public static final byte ft(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Byte b2 = null;
        boolean z = false;
        for (byte b3 : bArr) {
            if (ha0.invoke(Byte.valueOf(b3)).booleanValue()) {
                if (!z) {
                    b2 = Byte.valueOf(b3);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(b2, "null cannot be cast to non-null type kotlin.Byte");
            return b2.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Boolean> fu(@NotNull boolean[] zArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(iterable, "indices");
        int b0 = C8466oF.b0(iterable, 10);
        if (b0 == 0) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList(b0);
        for (Integer num : iterable) {
            arrayList.add(Boolean.valueOf(zArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] fv(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        C4788Ye.U3(tArr2);
        return tArr2;
    }

    @NotNull
    public static final <T> Set<T> fw(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<T> nz = nz(tArr);
        C9444sF.H0(nz, iterable);
        return nz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long fx(float[] fArr, HA0<? super Float, Long> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (float f2 : fArr) {
            j2 += ha0.invoke(Float.valueOf(f2)).longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Short> fy(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int Ge = Ge(sArr); -1 < Ge; Ge--) {
            if (!ha0.invoke(Short.valueOf(sArr[Ge])).booleanValue()) {
                return v9(sArr, Ge + 1);
            }
        }
        return Vy(sArr);
    }

    @NotNull
    public static final List<Short> fz(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s2 : sArr) {
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    public static final boolean g5(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (float f2 : fArr) {
            if (!ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> g6(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends K> ha0, @NotNull HA0<? super Byte, ? extends V> ha02) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(bArr.length), 16));
        for (byte b2 : bArr) {
            linkedHashMap.put(ha0.invoke(Byte.valueOf(b2)), ha02.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V> Map<Boolean, V> g7(boolean[] zArr, HA0<? super Boolean, ? extends V> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(zArr.length), 16));
        for (boolean z : zArr) {
            linkedHashMap.put(Boolean.valueOf(z), ha0.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @XP0
    public static final float g8(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return fArr[3];
    }

    @NotNull
    public static final <K> List<Character> g9(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            if (hashSet.add(ha0.invoke(Character.valueOf(c2)))) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> gA(@NotNull byte[] bArr, @NotNull R[] rArr, @NotNull VA0<? super Byte, ? super R, ? extends V> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Byte.valueOf(bArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @XP0
    public static final boolean ga(boolean[] zArr, int i2, HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "defaultValue");
        if (i2 >= 0 && i2 < zArr.length) {
            return zArr[i2];
        }
        return ha0.invoke(Integer.valueOf(i2)).booleanValue();
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C gb(@NotNull double[] dArr, @NotNull C c2, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (double d2 : dArr) {
            if (!ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                c2.add(Double.valueOf(d2));
            }
        }
        return c2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <T, R> R gc(T[] tArr, HA0<? super T, ? extends R> ha0) {
        R r2;
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "transform");
        int length = tArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                r2 = ha0.invoke(tArr[i2]);
                if (r2 != null) {
                    break;
                }
                i2++;
            } else {
                r2 = null;
                break;
            }
        }
        if (r2 != null) {
            return r2;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C gd(@NotNull char[] cArr, @NotNull C c2, @NotNull HA0<? super Character, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (char c3 : cArr) {
            C9444sF.q0(c2, ha0.invoke(Character.valueOf(c3)));
        }
        return c2;
    }

    public static final void ge(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, C7458kA2> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (boolean z : zArr) {
            ha0.invoke(Boolean.valueOf(z));
        }
    }

    @NotNull
    public static final <K> Map<K, List<Float>> gf(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends K> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f2 : fArr) {
            K invoke = ha0.invoke(Float.valueOf(f2));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Float.valueOf(f2));
        }
        return linkedHashMap;
    }

    public static final int gg(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final String gh(@NotNull byte[] bArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Byte, ? extends CharSequence> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Og(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final Double gi(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            double d2 = dArr[length];
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte gj(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = ze(bArr);
        if (ze == 0) {
            return Byte.valueOf(b2);
        }
        R invoke = ha0.invoke(Byte.valueOf(b2));
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                byte b3 = bArr[i2];
                R invoke2 = ha0.invoke(Byte.valueOf(b3));
                if (invoke.compareTo(invoke2) < 0) {
                    b2 = b3;
                    invoke = invoke2;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Byte.valueOf(b2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R gk(boolean[] zArr, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Boolean.valueOf(zArr[0]));
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                R invoke2 = ha0.invoke(Boolean.valueOf(zArr[i2]));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float gl(@NotNull Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length != 0) {
            float floatValue = fArr[0].floatValue();
            int Fe = Fe(fArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    floatValue = Math.max(floatValue, fArr[i2].floatValue());
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float gm(double[] dArr, HA0<? super Double, Float> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            float floatValue = ha0.invoke(Double.valueOf(dArr[0])).floatValue();
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Double.valueOf(dArr[i2])).floatValue());
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R gn(byte[] bArr, Comparator<? super R> comparator, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Byte.valueOf(bArr[0]));
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                R invoke = ha0.invoke(Byte.valueOf(bArr[i2]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final boolean go(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.3")
    public static final long gp(@NotNull long[] jArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (jArr.length != 0) {
            return jArr[abstractC10696xN1.m(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Boolean gq(@NotNull boolean[] zArr, @NotNull VA0<? super Boolean, ? super Boolean, Boolean> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                z = va0.i(Boolean.valueOf(z), Boolean.valueOf(zArr[i2])).booleanValue();
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final void gr(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length >= 0) {
            int Ce = Ce(fArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    float f2 = fArr[i2];
                    fArr[i2] = fArr[Ce];
                    fArr[Ce] = f2;
                    Ce--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Integer> gs(int[] iArr, VA0<? super Integer, ? super Integer, Integer> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (iArr.length == 0) {
            return C8222nF.H();
        }
        int i2 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i2));
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            i2 = va0.i(Integer.valueOf(i2), Integer.valueOf(iArr[i3])).intValue();
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static char gt(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Boolean> gu(@NotNull boolean[] zArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return C8222nF.H();
        }
        return C4788Ye.v(C4788Ye.n1(zArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1));
    }

    @NotNull
    public static final short[] gv(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        C4788Ye.W3(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Short> gw(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Short> oz = oz(sArr);
        C9444sF.H0(oz, iterable);
        return oz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long gx(int[] iArr, HA0<? super Integer, Long> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (int i2 : iArr) {
            j2 += ha0.invoke(Integer.valueOf(i2)).longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Boolean> gy(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int He = He(zArr); -1 < He; He--) {
            if (!ha0.invoke(Boolean.valueOf(zArr[He])).booleanValue()) {
                return w9(zArr, He + 1);
            }
        }
        return Wy(zArr);
    }

    @NotNull
    public static final List<Boolean> gz(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static final boolean h5(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i2 : iArr) {
            if (!ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K> Map<K, Character> h6(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(cArr.length), 16));
        for (char c2 : cArr) {
            linkedHashMap.put(ha0.invoke(Character.valueOf(c2)), Character.valueOf(c2));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V, M extends Map<? super Byte, ? super V>> M h7(byte[] bArr, M m2, HA0<? super Byte, ? extends V> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (byte b2 : bArr) {
            m2.put(Byte.valueOf(b2), ha0.invoke(Byte.valueOf(b2)));
        }
        return m2;
    }

    @XP0
    public static final int h8(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return iArr[3];
    }

    @NotNull
    public static final <K> List<Double> h9(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends K> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (hashSet.add(ha0.invoke(Double.valueOf(d2)))) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<C4180Rx1<Character, R>> hA(@NotNull char[] cArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(Character.valueOf(cArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @XP0
    public static final Boolean ha(boolean[] zArr, int i2) {
        C6562gT0.p(zArr, "<this>");
        return Re(zArr, i2);
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C hb(@NotNull float[] fArr, @NotNull C c2, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (float f2 : fArr) {
            if (!ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                c2.add(Float.valueOf(f2));
            }
        }
        return c2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    public static final <T, R> R hc(T[] tArr, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "transform");
        for (T t : tArr) {
            R invoke = ha0.invoke(t);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C hd(@NotNull double[] dArr, @NotNull C c2, @NotNull HA0<? super Double, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (double d2 : dArr) {
            C9444sF.q0(c2, ha0.invoke(Double.valueOf(d2)));
        }
        return c2;
    }

    public static final void he(@NotNull byte[] bArr, @NotNull VA0<? super Integer, ? super Byte, C7458kA2> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Byte.valueOf(bArr[i2]));
            i2++;
            i3++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> hf(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends K> ha0, @NotNull HA0<? super Float, ? extends V> ha02) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f2 : fArr) {
            K invoke = ha0.invoke(Float.valueOf(f2));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    public static final int hg(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final String hh(@NotNull char[] cArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Character, ? extends CharSequence> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Pg(cArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final Float hi(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character hj(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = Ae(cArr);
        if (Ae == 0) {
            return Character.valueOf(c2);
        }
        R invoke = ha0.invoke(Character.valueOf(c2));
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                char c3 = cArr[i2];
                R invoke2 = ha0.invoke(Character.valueOf(c3));
                if (invoke.compareTo(invoke2) < 0) {
                    c2 = c3;
                    invoke = invoke2;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Character.valueOf(c2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double hk(byte[] bArr, HA0<? super Byte, Double> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Byte.valueOf(bArr[i2])).doubleValue());
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final int hl(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int De = De(iArr);
            int i3 = 1;
            if (1 <= De) {
                while (true) {
                    int i4 = iArr[i3];
                    if (i2 < i4) {
                        i2 = i4;
                    }
                    if (i3 == De) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float hm(float[] fArr, HA0<? super Float, Float> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            float floatValue = ha0.invoke(Float.valueOf(fArr[0])).floatValue();
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Float.valueOf(fArr[i2])).floatValue());
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R hn(char[] cArr, Comparator<? super R> comparator, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Character.valueOf(cArr[0]));
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                R invoke = ha0.invoke(Character.valueOf(cArr[i2]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final boolean ho(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> T hp(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return (T) ip(tArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte hq(@NotNull byte[] bArr, @NotNull VA0<? super Byte, ? super Byte, Byte> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                b2 = va0.i(Byte.valueOf(b2), Byte.valueOf(bArr[i2])).byteValue();
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Byte.valueOf(b2);
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void hr(@NotNull float[] fArr, int i2, int i3) {
        C6562gT0.p(fArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, fArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                float f2 = fArr[i2];
                fArr[i2] = fArr[i5];
                fArr[i5] = f2;
                i5--;
                i2++;
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Long> hs(long[] jArr, VA0<? super Long, ? super Long, Long> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (jArr.length == 0) {
            return C8222nF.H();
        }
        long j2 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j2));
        int length = jArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            j2 = va0.i(Long.valueOf(j2), Long.valueOf(jArr[i2])).longValue();
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static final char ht(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Character ch = null;
        boolean z = false;
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                if (!z) {
                    ch = Character.valueOf(c2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static byte[] hu(@NotNull byte[] bArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(collection, "indices");
        byte[] bArr2 = new byte[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            bArr2[i2] = bArr[num.intValue()];
            i2++;
        }
        return bArr2;
    }

    @NotNull
    public static final byte[] hv(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        Bu(copyOf);
        return copyOf;
    }

    @NotNull
    public static final Set<Boolean> hw(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Boolean> pz = pz(zArr);
        C9444sF.H0(pz, iterable);
        return pz;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long hx(long[] jArr, HA0<? super Long, Long> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += ha0.invoke(Long.valueOf(j3)).longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Byte> hy(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            if (!ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Byte> hz(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return (Set) ty(bArr, new LinkedHashSet(C8683p81.j(bArr.length)));
    }

    public static final boolean i5(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (long j2 : jArr) {
            if (!ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> i6(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends K> ha0, @NotNull HA0<? super Character, ? extends V> ha02) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(cArr.length), 16));
        for (char c2 : cArr) {
            linkedHashMap.put(ha0.invoke(Character.valueOf(c2)), ha02.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V, M extends Map<? super Character, ? super V>> M i7(char[] cArr, M m2, HA0<? super Character, ? extends V> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (char c2 : cArr) {
            m2.put(Character.valueOf(c2), ha0.invoke(Character.valueOf(c2)));
        }
        return m2;
    }

    @XP0
    public static final long i8(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return jArr[3];
    }

    @NotNull
    public static final <K> List<Float> i9(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends K> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            if (hashSet.add(ha0.invoke(Float.valueOf(f2)))) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> iA(@NotNull char[] cArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super Character, ? super R, ? extends V> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(Character.valueOf(cArr[i2]), obj));
            i2++;
        }
        return arrayList;
    }

    @XP0
    public static final Byte ia(byte[] bArr, int i2) {
        C6562gT0.p(bArr, "<this>");
        return Se(bArr, i2);
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C ib(@NotNull int[] iArr, @NotNull C c2, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (int i2 : iArr) {
            if (!ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                c2.add(Integer.valueOf(i2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Boolean ic(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C id(@NotNull float[] fArr, @NotNull C c2, @NotNull HA0<? super Float, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (float f2 : fArr) {
            C9444sF.q0(c2, ha0.invoke(Float.valueOf(f2)));
        }
        return c2;
    }

    public static final void ie(@NotNull char[] cArr, @NotNull VA0<? super Integer, ? super Character, C7458kA2> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Character.valueOf(cArr[i2]));
            i2++;
            i3++;
        }
    }

    public static final int ig(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final String ih(@NotNull double[] dArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Double, ? extends CharSequence> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Qg(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final Float ii(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            float f2 = fArr[length];
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double ij(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = Be(dArr);
        if (Be == 0) {
            return Double.valueOf(d2);
        }
        R invoke = ha0.invoke(Double.valueOf(d2));
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                double d3 = dArr[i2];
                R invoke2 = ha0.invoke(Double.valueOf(d3));
                if (invoke.compareTo(invoke2) < 0) {
                    d2 = d3;
                    invoke = invoke2;
                }
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(d2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double ik(char[] cArr, HA0<? super Character, Double> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Character.valueOf(cArr[0])).doubleValue();
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Character.valueOf(cArr[i2])).doubleValue());
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final long il(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length != 0) {
            long j2 = jArr[0];
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    long j3 = jArr[i2];
                    if (j2 < j3) {
                        j2 = j3;
                    }
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return j2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float im(int[] iArr, HA0<? super Integer, Float> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            float floatValue = ha0.invoke(Integer.valueOf(iArr[0])).floatValue();
            int De = De(iArr);
            int i2 = 1;
            if (1 <= De) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Integer.valueOf(iArr[i2])).floatValue());
                    if (i2 == De) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R in(double[] dArr, Comparator<? super R> comparator, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Double.valueOf(dArr[0]));
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                R invoke = ha0.invoke(Double.valueOf(dArr[i2]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final boolean io(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.3")
    public static final <T> T ip(@NotNull T[] tArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (tArr.length != 0) {
            return tArr[abstractC10696xN1.m(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character iq(@NotNull char[] cArr, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                c2 = va0.i(Character.valueOf(c2), Character.valueOf(cArr[i2])).charValue();
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Character.valueOf(c2);
    }

    public static void ir(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length >= 0) {
            int De = De(iArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = iArr[i2];
                    iArr[i2] = iArr[De];
                    iArr[De] = i3;
                    De--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> is(@NotNull T[] tArr, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (tArr.length == 0) {
            return C8222nF.H();
        }
        S s2 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s2);
        int length = tArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            s2 = va0.i(s2, (Object) tArr[i2]);
            arrayList.add(s2);
        }
        return arrayList;
    }

    @NotNull
    public static byte[] iu(@NotNull byte[] bArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return new byte[0];
        }
        return C4788Ye.f1(bArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final char[] iv(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        Du(copyOf);
        return copyOf;
    }

    public static final double iw(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += d3;
        }
        return d2;
    }

    @InterfaceC8046mW0(name = "sumOfLong")
    public static final long ix(@NotNull Long[] lArr) {
        C6562gT0.p(lArr, "<this>");
        long j2 = 0;
        for (Long l2 : lArr) {
            j2 += l2.longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Character> iy(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            if (!ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Character> iz(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return (Set) uy(cArr, new LinkedHashSet(C8683p81.j(C5075aO1.B(cArr.length, 128))));
    }

    public static final <T> boolean j5(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : tArr) {
            if (!ha0.invoke(t).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K> Map<K, Double> j6(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends K> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(dArr.length), 16));
        for (double d2 : dArr) {
            linkedHashMap.put(ha0.invoke(Double.valueOf(d2)), Double.valueOf(d2));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V, M extends Map<? super Double, ? super V>> M j7(double[] dArr, M m2, HA0<? super Double, ? extends V> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (double d2 : dArr) {
            m2.put(Double.valueOf(d2), ha0.invoke(Double.valueOf(d2)));
        }
        return m2;
    }

    @XP0
    public static final <T> T j8(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return tArr[3];
    }

    @NotNull
    public static final <K> List<Integer> j9(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends K> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (hashSet.add(ha0.invoke(Integer.valueOf(i2)))) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<C4180Rx1<Character, Character>> jA(@NotNull char[] cArr, @NotNull char[] cArr2) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(cArr2, "other");
        int min = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(Character.valueOf(cArr[i2]), Character.valueOf(cArr2[i2])));
        }
        return arrayList;
    }

    @XP0
    public static final Character ja(char[] cArr, int i2) {
        C6562gT0.p(cArr, "<this>");
        return Te(cArr, i2);
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C jb(@NotNull long[] jArr, @NotNull C c2, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (long j2 : jArr) {
            if (!ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                c2.add(Long.valueOf(j2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Boolean jc(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C jd(@NotNull int[] iArr, @NotNull C c2, @NotNull HA0<? super Integer, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (int i2 : iArr) {
            C9444sF.q0(c2, ha0.invoke(Integer.valueOf(i2)));
        }
        return c2;
    }

    public static final void je(@NotNull double[] dArr, @NotNull VA0<? super Integer, ? super Double, C7458kA2> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Double.valueOf(dArr[i2]));
            i2++;
            i3++;
        }
    }

    @NotNull
    public static final <K> Map<K, List<Integer>> jf(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends K> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 : iArr) {
            K invoke = ha0.invoke(Integer.valueOf(i2));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Integer.valueOf(i2));
        }
        return linkedHashMap;
    }

    public static final int jg(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final String jh(@NotNull float[] fArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Float, ? extends CharSequence> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Rg(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final Integer ji(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float jj(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = Ce(fArr);
        if (Ce == 0) {
            return Float.valueOf(f2);
        }
        R invoke = ha0.invoke(Float.valueOf(f2));
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                float f3 = fArr[i2];
                R invoke2 = ha0.invoke(Float.valueOf(f3));
                if (invoke.compareTo(invoke2) < 0) {
                    f2 = f3;
                    invoke = invoke2;
                }
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double jk(double[] dArr, HA0<? super Double, Double> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Double.valueOf(dArr[0])).doubleValue();
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Double.valueOf(dArr[i2])).doubleValue());
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T jl(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length != 0) {
            T t = tArr[0];
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    T t2 = tArr[i2];
                    if (t.compareTo(t2) < 0) {
                        t = t2;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float jm(long[] jArr, HA0<? super Long, Float> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            float floatValue = ha0.invoke(Long.valueOf(jArr[0])).floatValue();
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Long.valueOf(jArr[i2])).floatValue());
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R jn(float[] fArr, Comparator<? super R> comparator, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Float.valueOf(fArr[0]));
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                R invoke = ha0.invoke(Float.valueOf(fArr[i2]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final boolean jo(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final short jp(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return kp(sArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double jq(@NotNull double[] dArr, @NotNull VA0<? super Double, ? super Double, Double> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                d2 = va0.i(Double.valueOf(d2), Double.valueOf(dArr[i2])).doubleValue();
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(d2);
    }

    @InterfaceC6480g82(version = "1.4")
    public static void jr(@NotNull int[] iArr, int i2, int i3) {
        C6562gT0.p(iArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, iArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                int i6 = iArr[i2];
                iArr[i2] = iArr[i5];
                iArr[i5] = i6;
                i5--;
                i2++;
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Short> js(short[] sArr, VA0<? super Short, ? super Short, Short> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (sArr.length == 0) {
            return C8222nF.H();
        }
        short s2 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s2));
        int length = sArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            s2 = va0.i(Short.valueOf(s2), Short.valueOf(sArr[i2])).shortValue();
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    public static final double jt(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length == 1) {
                return dArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final char[] ju(@NotNull char[] cArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(collection, "indices");
        char[] cArr2 = new char[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            cArr2[i2] = cArr[num.intValue()];
            i2++;
        }
        return cArr2;
    }

    @NotNull
    public static final double[] jv(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        Fu(copyOf);
        return copyOf;
    }

    public static final float jw(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        float f2 = 0.0f;
        for (float f3 : fArr) {
            f2 += f3;
        }
        return f2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> long jx(T[] tArr, HA0<? super T, Long> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (T t : tArr) {
            j2 += ha0.invoke(t).longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Double> jy(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (!ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Double> jz(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return (Set) vy(dArr, new LinkedHashSet(C8683p81.j(dArr.length)));
    }

    public static final boolean k5(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (short s2 : sArr) {
            if (!ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> k6(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends K> ha0, @NotNull HA0<? super Double, ? extends V> ha02) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(dArr.length), 16));
        for (double d2 : dArr) {
            linkedHashMap.put(ha0.invoke(Double.valueOf(d2)), ha02.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V, M extends Map<? super Float, ? super V>> M k7(float[] fArr, M m2, HA0<? super Float, ? extends V> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (float f2 : fArr) {
            m2.put(Float.valueOf(f2), ha0.invoke(Float.valueOf(f2)));
        }
        return m2;
    }

    @XP0
    public static final short k8(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return sArr[3];
    }

    @NotNull
    public static final <K> List<Long> k9(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends K> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (hashSet.add(ha0.invoke(Long.valueOf(j2)))) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> kA(@NotNull char[] cArr, @NotNull char[] cArr2, @NotNull VA0<? super Character, ? super Character, ? extends V> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(cArr2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Character.valueOf(cArr[i2]), Character.valueOf(cArr2[i2])));
        }
        return arrayList;
    }

    @XP0
    public static final Double ka(double[] dArr, int i2) {
        C6562gT0.p(dArr, "<this>");
        return Ue(dArr, i2);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C kb(@NotNull T[] tArr, @NotNull C c2, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (T t : tArr) {
            if (!ha0.invoke(t).booleanValue()) {
                c2.add(t);
            }
        }
        return c2;
    }

    @Nullable
    public static final Byte kc(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C kd(@NotNull long[] jArr, @NotNull C c2, @NotNull HA0<? super Long, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (long j2 : jArr) {
            C9444sF.q0(c2, ha0.invoke(Long.valueOf(j2)));
        }
        return c2;
    }

    public static final void ke(@NotNull float[] fArr, @NotNull VA0<? super Integer, ? super Float, C7458kA2> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Float.valueOf(fArr[i2]));
            i2++;
            i3++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> kf(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends K> ha0, @NotNull HA0<? super Integer, ? extends V> ha02) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 : iArr) {
            K invoke = ha0.invoke(Integer.valueOf(i2));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Integer.valueOf(i2)));
        }
        return linkedHashMap;
    }

    public static final <T> int kg(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final String kh(@NotNull int[] iArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Integer, ? extends CharSequence> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Sg(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final Integer ki(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            int i3 = iArr[length];
            if (ha0.invoke(Integer.valueOf(i3)).booleanValue()) {
                return Integer.valueOf(i3);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer kj(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int De = De(iArr);
        if (De == 0) {
            return Integer.valueOf(i2);
        }
        R invoke = ha0.invoke(Integer.valueOf(i2));
        int i3 = 1;
        if (1 <= De) {
            while (true) {
                int i4 = iArr[i3];
                R invoke2 = ha0.invoke(Integer.valueOf(i4));
                if (invoke.compareTo(invoke2) < 0) {
                    i2 = i4;
                    invoke = invoke2;
                }
                if (i3 == De) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double kk(float[] fArr, HA0<? super Float, Double> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Float.valueOf(fArr[0])).doubleValue();
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Float.valueOf(fArr[i2])).doubleValue());
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC8046mW0(name = "maxOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final short kl(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length != 0) {
            short s2 = sArr[0];
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    short s3 = sArr[i2];
                    if (s2 < s3) {
                        s2 = s3;
                    }
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return s2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> float km(T[] tArr, HA0<? super T, Float> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            float floatValue = ha0.invoke(tArr[0]).floatValue();
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(tArr[i2]).floatValue());
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R kn(int[] iArr, Comparator<? super R> comparator, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Integer.valueOf(iArr[0]));
        int De = De(iArr);
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                R invoke = ha0.invoke(Integer.valueOf(iArr[i2]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final boolean ko(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.3")
    public static final short kp(@NotNull short[] sArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (sArr.length != 0) {
            return sArr[abstractC10696xN1.m(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float kq(@NotNull float[] fArr, @NotNull VA0<? super Float, ? super Float, Float> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                f2 = va0.i(Float.valueOf(f2), Float.valueOf(fArr[i2])).floatValue();
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    public static void kr(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length >= 0) {
            int Ee = Ee(jArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    jArr[i2] = jArr[Ee];
                    jArr[Ee] = j2;
                    Ee--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Boolean> ks(boolean[] zArr, VA0<? super Boolean, ? super Boolean, Boolean> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (zArr.length == 0) {
            return C8222nF.H();
        }
        boolean z = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z));
        int length = zArr.length;
        int i2 = 1;
        while (i2 < length) {
            Boolean i3 = va0.i(Boolean.valueOf(z), Boolean.valueOf(zArr[i2]));
            boolean booleanValue = i3.booleanValue();
            arrayList.add(i3);
            i2++;
            z = booleanValue;
        }
        return arrayList;
    }

    public static final double kt(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Double d2 = null;
        boolean z = false;
        for (double d3 : dArr) {
            if (ha0.invoke(Double.valueOf(d3)).booleanValue()) {
                if (!z) {
                    d2 = Double.valueOf(d3);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(d2, "null cannot be cast to non-null type kotlin.Double");
            return d2.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final char[] ku(@NotNull char[] cArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return new char[0];
        }
        return C4788Ye.g1(cArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final float[] kv(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        Hu(copyOf);
        return copyOf;
    }

    public static final int kw(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        int i2 = 0;
        for (byte b2 : bArr) {
            i2 += b2;
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long kx(short[] sArr, HA0<? super Short, Long> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (short s2 : sArr) {
            j2 += ha0.invoke(Short.valueOf(s2)).longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Float> ky(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            if (!ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Float> kz(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return (Set) wy(fArr, new LinkedHashSet(C8683p81.j(fArr.length)));
    }

    public static final boolean l5(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (boolean z : zArr) {
            if (!ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K> Map<K, Float> l6(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends K> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(fArr.length), 16));
        for (float f2 : fArr) {
            linkedHashMap.put(ha0.invoke(Float.valueOf(f2)), Float.valueOf(f2));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V, M extends Map<? super Integer, ? super V>> M l7(int[] iArr, M m2, HA0<? super Integer, ? extends V> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (int i2 : iArr) {
            m2.put(Integer.valueOf(i2), ha0.invoke(Integer.valueOf(i2)));
        }
        return m2;
    }

    @XP0
    public static final boolean l8(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return zArr[3];
    }

    @NotNull
    public static final <T, K> List<T> l9(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (hashSet.add(ha0.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<C4180Rx1<Character, R>> lA(@NotNull char[] cArr, @NotNull R[] rArr) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            char c2 = cArr[i2];
            arrayList.add(C6670gv2.a(Character.valueOf(c2), rArr[i2]));
        }
        return arrayList;
    }

    @XP0
    public static final Float la(float[] fArr, int i2) {
        C6562gT0.p(fArr, "<this>");
        return Ve(fArr, i2);
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C lb(@NotNull short[] sArr, @NotNull C c2, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (short s2 : sArr) {
            if (!ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                c2.add(Short.valueOf(s2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Byte lc(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C ld(@NotNull T[] tArr, @NotNull C c2, @NotNull HA0<? super T, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (T t : tArr) {
            C9444sF.q0(c2, ha0.invoke(t));
        }
        return c2;
    }

    public static final void le(@NotNull int[] iArr, @NotNull VA0<? super Integer, ? super Integer, C7458kA2> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Integer.valueOf(iArr[i2]));
            i2++;
            i3++;
        }
    }

    @NotNull
    public static final <K> Map<K, List<Long>> lf(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends K> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j2 : jArr) {
            K invoke = ha0.invoke(Long.valueOf(j2));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Long.valueOf(j2));
        }
        return linkedHashMap;
    }

    public static final int lg(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final String lh(@NotNull long[] jArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Long, ? extends CharSequence> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Tg(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final Long li(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long lj(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int Ee = Ee(jArr);
        if (Ee == 0) {
            return Long.valueOf(j2);
        }
        R invoke = ha0.invoke(Long.valueOf(j2));
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                long j3 = jArr[i2];
                R invoke2 = ha0.invoke(Long.valueOf(j3));
                if (invoke.compareTo(invoke2) < 0) {
                    j2 = j3;
                    invoke = invoke2;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Long.valueOf(j2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double lk(int[] iArr, HA0<? super Integer, Double> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int De = De(iArr);
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Integer.valueOf(iArr[i2])).doubleValue());
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Boolean ll(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                boolean z2 = zArr[i2];
                if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) < 0) {
                    z = z2;
                }
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float lm(short[] sArr, HA0<? super Short, Float> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            float floatValue = ha0.invoke(Short.valueOf(sArr[0])).floatValue();
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Short.valueOf(sArr[i2])).floatValue());
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R ln(long[] jArr, Comparator<? super R> comparator, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Long.valueOf(jArr[0]));
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                R invoke = ha0.invoke(Long.valueOf(jArr[i2]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final boolean lo(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final boolean lp(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return mp(zArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer lq(@NotNull int[] iArr, @NotNull VA0<? super Integer, ? super Integer, Integer> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int De = De(iArr);
        int i3 = 1;
        if (1 <= De) {
            while (true) {
                i2 = va0.i(Integer.valueOf(i2), Integer.valueOf(iArr[i3])).intValue();
                if (i3 == De) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    @InterfaceC6480g82(version = "1.4")
    public static void lr(@NotNull long[] jArr, int i2, int i3) {
        C6562gT0.p(jArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, jArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                long j2 = jArr[i2];
                jArr[i2] = jArr[i5];
                jArr[i5] = j2;
                i5--;
                i2++;
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Byte> ls(byte[] bArr, XA0<? super Integer, ? super Byte, ? super Byte, Byte> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (bArr.length == 0) {
            return C8222nF.H();
        }
        byte b2 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b2));
        int length = bArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            b2 = xa0.P(Integer.valueOf(i2), Byte.valueOf(b2), Byte.valueOf(bArr[i2])).byteValue();
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static final float lt(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length == 1) {
                return fArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final double[] lu(@NotNull double[] dArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(collection, "indices");
        double[] dArr2 = new double[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            dArr2[i2] = dArr[num.intValue()];
            i2++;
        }
        return dArr2;
    }

    @NotNull
    public static final int[] lv(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        Ju(copyOf);
        return copyOf;
    }

    public static int lw(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfLong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final long lx(boolean[] zArr, HA0<? super Boolean, Long> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long j2 = 0;
        for (boolean z : zArr) {
            j2 += ha0.invoke(Boolean.valueOf(z)).longValue();
        }
        return j2;
    }

    @NotNull
    public static final List<Integer> ly(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (!ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Integer> lz(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return (Set) xy(iArr, new LinkedHashSet(C8683p81.j(iArr.length)));
    }

    public static boolean m5(@NotNull byte[] bArr) {
        boolean z;
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <K, V> Map<K, V> m6(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends K> ha0, @NotNull HA0<? super Float, ? extends V> ha02) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(fArr.length), 16));
        for (float f2 : fArr) {
            linkedHashMap.put(ha0.invoke(Float.valueOf(f2)), ha02.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V, M extends Map<? super Long, ? super V>> M m7(long[] jArr, M m2, HA0<? super Long, ? extends V> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (long j2 : jArr) {
            m2.put(Long.valueOf(j2), ha0.invoke(Long.valueOf(j2)));
        }
        return m2;
    }

    @XP0
    public static final byte m8(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return bArr[4];
    }

    @NotNull
    public static final <K> List<Short> m9(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends K> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            if (hashSet.add(ha0.invoke(Short.valueOf(s2)))) {
                arrayList.add(Short.valueOf(s2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> mA(@NotNull char[] cArr, @NotNull R[] rArr, @NotNull VA0<? super Character, ? super R, ? extends V> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Character.valueOf(cArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @XP0
    public static final Integer ma(int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        return We(iArr, i2);
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C mb(@NotNull boolean[] zArr, @NotNull C c2, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (boolean z : zArr) {
            if (!ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                c2.add(Boolean.valueOf(z));
            }
        }
        return c2;
    }

    @Nullable
    public static final Character mc(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C md(@NotNull short[] sArr, @NotNull C c2, @NotNull HA0<? super Short, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (short s2 : sArr) {
            C9444sF.q0(c2, ha0.invoke(Short.valueOf(s2)));
        }
        return c2;
    }

    public static final void me(@NotNull long[] jArr, @NotNull VA0<? super Integer, ? super Long, C7458kA2> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Long.valueOf(jArr[i2]));
            i2++;
            i3++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> mf(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends K> ha0, @NotNull HA0<? super Long, ? extends V> ha02) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j2 : jArr) {
            K invoke = ha0.invoke(Long.valueOf(j2));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Long.valueOf(j2)));
        }
        return linkedHashMap;
    }

    public static final int mg(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (ha0.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @NotNull
    public static final <T> String mh(@NotNull T[] tArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super T, ? extends CharSequence> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Ug(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final Long mi(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            long j2 = jArr[length];
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                return Long.valueOf(j2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T mj(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int Fe = Fe(tArr);
        if (Fe != 0) {
            R invoke = ha0.invoke(t);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    T t2 = tArr[i2];
                    R invoke2 = ha0.invoke(t2);
                    if (invoke.compareTo(invoke2) < 0) {
                        t = t2;
                        invoke = invoke2;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return t;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double mk(long[] jArr, HA0<? super Long, Double> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Long.valueOf(jArr[0])).doubleValue();
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Long.valueOf(jArr[i2])).doubleValue());
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte ml(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                byte b3 = bArr[i2];
                if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) < 0) {
                    b2 = b3;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Byte.valueOf(b2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final float mm(boolean[] zArr, HA0<? super Boolean, Float> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            float floatValue = ha0.invoke(Boolean.valueOf(zArr[0])).floatValue();
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    floatValue = Math.min(floatValue, ha0.invoke(Boolean.valueOf(zArr[i2])).floatValue());
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R> R mn(T[] tArr, Comparator<? super R> comparator, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(tArr[0]);
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                R invoke = ha0.invoke(tArr[i2]);
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final boolean mo(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.3")
    public static final boolean mp(@NotNull boolean[] zArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (zArr.length != 0) {
            return zArr[abstractC10696xN1.m(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long mq(@NotNull long[] jArr, @NotNull VA0<? super Long, ? super Long, Long> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                j2 = va0.i(Long.valueOf(j2), Long.valueOf(jArr[i2])).longValue();
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Long.valueOf(j2);
    }

    public static final <T> void mr(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length >= 0) {
            int Fe = Fe(tArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    T t = tArr[i2];
                    tArr[i2] = tArr[Fe];
                    tArr[Fe] = t;
                    Fe--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Character> ms(char[] cArr, XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (cArr.length == 0) {
            return C8222nF.H();
        }
        char c2 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c2));
        int length = cArr.length;
        int i2 = 1;
        while (i2 < length) {
            Character P = xa0.P(Integer.valueOf(i2), Character.valueOf(c2), Character.valueOf(cArr[i2]));
            char charValue = P.charValue();
            arrayList.add(P);
            i2++;
            c2 = charValue;
        }
        return arrayList;
    }

    public static final float mt(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Float f2 = null;
        boolean z = false;
        for (float f3 : fArr) {
            if (ha0.invoke(Float.valueOf(f3)).booleanValue()) {
                if (!z) {
                    f2 = Float.valueOf(f3);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(f2, "null cannot be cast to non-null type kotlin.Float");
            return f2.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final double[] mu(@NotNull double[] dArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return new double[0];
        }
        return C4788Ye.h1(dArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final long[] mv(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        Lu(copyOf);
        return copyOf;
    }

    public static final int mw(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        int i2 = 0;
        for (short s2 : sArr) {
            i2 += s2;
        }
        return i2;
    }

    @InterfaceC8046mW0(name = "sumOfShort")
    public static final int mx(@NotNull Short[] shArr) {
        C6562gT0.p(shArr, "<this>");
        int i2 = 0;
        for (Short sh : shArr) {
            i2 += sh.shortValue();
        }
        return i2;
    }

    @NotNull
    public static final List<Long> my(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (!ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Long> mz(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return (Set) yy(jArr, new LinkedHashSet(C8683p81.j(jArr.length)));
    }

    public static final boolean n5(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K> Map<K, Integer> n6(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends K> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(iArr.length), 16));
        for (int i2 : iArr) {
            linkedHashMap.put(ha0.invoke(Integer.valueOf(i2)), Integer.valueOf(i2));
        }
        return linkedHashMap;
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M n7(@NotNull K[] kArr, @NotNull M m2, @NotNull HA0<? super K, ? extends V> ha0) {
        C6562gT0.p(kArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (K k2 : kArr) {
            m2.put(k2, ha0.invoke(k2));
        }
        return m2;
    }

    @XP0
    public static final char n8(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return cArr[4];
    }

    @NotNull
    public static final <K> List<Boolean> n9(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends K> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (hashSet.add(ha0.invoke(Boolean.valueOf(z)))) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<C4180Rx1<Double, R>> nA(@NotNull double[] dArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(Double.valueOf(dArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @XP0
    public static final Long na(long[] jArr, int i2) {
        C6562gT0.p(jArr, "<this>");
        return Xe(jArr, i2);
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C nb(@NotNull byte[] bArr, @NotNull C c2, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                c2.add(Byte.valueOf(b2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Character nc(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
        }
        return null;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C nd(@NotNull boolean[] zArr, @NotNull C c2, @NotNull HA0<? super Boolean, ? extends Iterable<? extends R>> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "transform");
        for (boolean z : zArr) {
            C9444sF.q0(c2, ha0.invoke(Boolean.valueOf(z)));
        }
        return c2;
    }

    public static final <T> void ne(@NotNull T[] tArr, @NotNull VA0<? super Integer, ? super T, C7458kA2> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), tArr[i2]);
            i2++;
            i3++;
        }
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> nf(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : tArr) {
            K invoke = ha0.invoke(t);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(t);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Byte> ng(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Byte> hz = hz(bArr);
        C9444sF.R0(hz, iterable);
        return hz;
    }

    @NotNull
    public static final String nh(@NotNull short[] sArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Short, ? extends CharSequence> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Vg(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final <T> T ni(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short nj(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int Ge = Ge(sArr);
        if (Ge == 0) {
            return Short.valueOf(s2);
        }
        R invoke = ha0.invoke(Short.valueOf(s2));
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                short s3 = sArr[i2];
                R invoke2 = ha0.invoke(Short.valueOf(s3));
                if (invoke.compareTo(invoke2) < 0) {
                    s2 = s3;
                    invoke = invoke2;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Short.valueOf(s2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Double nk(T[] tArr, HA0<? super T, Double> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(tArr[0]).doubleValue();
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(tArr[i2]).doubleValue());
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character nl(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                char c3 = cArr[i2];
                if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) < 0) {
                    c2 = c3;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Character.valueOf(c2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R nm(byte[] bArr, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            R invoke = ha0.invoke(Byte.valueOf(bArr[0]));
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    R invoke2 = ha0.invoke(Byte.valueOf(bArr[i2]));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R nn(short[] sArr, Comparator<? super R> comparator, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Short.valueOf(sArr[0]));
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                R invoke = ha0.invoke(Short.valueOf(sArr[i2]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final boolean no(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Boolean np(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return op(zArr, AbstractC10696xN1.X);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <S, T extends S> S nq(@NotNull T[] tArr, @NotNull VA0<? super S, ? super T, ? extends S> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s2 = (Object) tArr[0];
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                s2 = va0.i(s2, (Object) tArr[i2]);
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return (S) s2;
    }

    @InterfaceC6480g82(version = "1.4")
    public static final <T> void nr(@NotNull T[] tArr, int i2, int i3) {
        C6562gT0.p(tArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, tArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                T t = tArr[i2];
                tArr[i2] = tArr[i5];
                tArr[i5] = t;
                i5--;
                i2++;
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Double> ns(double[] dArr, XA0<? super Integer, ? super Double, ? super Double, Double> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (dArr.length == 0) {
            return C8222nF.H();
        }
        double d2 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d2));
        int length = dArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            d2 = xa0.P(Integer.valueOf(i2), Double.valueOf(d2), Double.valueOf(dArr[i2])).doubleValue();
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    public static int nt(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length == 1) {
                return iArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final float[] nu(@NotNull float[] fArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(collection, "indices");
        float[] fArr2 = new float[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            fArr2[i2] = fArr[num.intValue()];
            i2++;
        }
        return fArr2;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] nv(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        C4788Ye.h4(tArr2, C11156zH.x());
        return tArr2;
    }

    public static long nw(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        return j2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int nx(byte[] bArr, HA0<? super Byte, C7162ix2> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (byte b2 : bArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(Byte.valueOf(b2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <T> List<T> ny(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (!ha0.invoke(t).booleanValue()) {
                break;
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Set<T> nz(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return (Set) zy(tArr, new LinkedHashSet(C8683p81.j(tArr.length)));
    }

    public static final boolean o5(@NotNull char[] cArr) {
        boolean z;
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <K, V> Map<K, V> o6(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends K> ha0, @NotNull HA0<? super Integer, ? extends V> ha02) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(iArr.length), 16));
        for (int i2 : iArr) {
            linkedHashMap.put(ha0.invoke(Integer.valueOf(i2)), ha02.invoke(Integer.valueOf(i2)));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V, M extends Map<? super Short, ? super V>> M o7(short[] sArr, M m2, HA0<? super Short, ? extends V> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (short s2 : sArr) {
            m2.put(Short.valueOf(s2), ha0.invoke(Short.valueOf(s2)));
        }
        return m2;
    }

    @XP0
    public static final double o8(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return dArr[4];
    }

    @NotNull
    public static final List<Byte> o9(@NotNull byte[] bArr, int i2) {
        C6562gT0.p(bArr, "<this>");
        if (i2 >= 0) {
            return Ox(bArr, C5075aO1.u(bArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, V> List<V> oA(@NotNull double[] dArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super Double, ? super R, ? extends V> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(Double.valueOf(dArr[i2]), obj));
            i2++;
        }
        return arrayList;
    }

    @XP0
    public static final <T> T oa(T[] tArr, int i2) {
        C6562gT0.p(tArr, "<this>");
        return (T) Ye(tArr, i2);
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C ob(@NotNull char[] cArr, @NotNull C c2, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (char c3 : cArr) {
            if (ha0.invoke(Character.valueOf(c3)).booleanValue()) {
                c2.add(Character.valueOf(c3));
            }
        }
        return c2;
    }

    @Nullable
    public static final Double oc(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final <R> R od(@NotNull byte[] bArr, R r2, @NotNull VA0<? super R, ? super Byte, ? extends R> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (byte b2 : bArr) {
            r2 = va0.i(r2, Byte.valueOf(b2));
        }
        return r2;
    }

    public static final void oe(@NotNull short[] sArr, @NotNull VA0<? super Integer, ? super Short, C7458kA2> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Short.valueOf(sArr[i2]));
            i2++;
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, List<V>> of(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Manifest manifest : tArr) {
            K invoke = ha0.invoke(manifest);
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(manifest));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Character> og(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Character> iz = iz(cArr);
        C9444sF.R0(iz, iterable);
        return iz;
    }

    @NotNull
    public static final String oh(@NotNull boolean[] zArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable HA0<? super Boolean, ? extends CharSequence> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return ((StringBuilder) Wg(zArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, ha0)).toString();
    }

    @Nullable
    public static final <T> T oi(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            T t = tArr[length];
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> byte oj(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            byte b2 = bArr[0];
            int ze = ze(bArr);
            if (ze != 0) {
                R invoke = ha0.invoke(Byte.valueOf(b2));
                int i2 = 1;
                if (1 <= ze) {
                    while (true) {
                        byte b3 = bArr[i2];
                        R invoke2 = ha0.invoke(Byte.valueOf(b3));
                        if (invoke.compareTo(invoke2) < 0) {
                            b2 = b3;
                            invoke = invoke2;
                        }
                        if (i2 == ze) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return b2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double ok(short[] sArr, HA0<? super Short, Double> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Short.valueOf(sArr[0])).doubleValue();
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Short.valueOf(sArr[i2])).doubleValue());
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double ol(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                double d3 = dArr[i2];
                if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) < 0) {
                    d2 = d3;
                }
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(d2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R om(char[] cArr, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            R invoke = ha0.invoke(Character.valueOf(cArr[0]));
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    R invoke2 = ha0.invoke(Character.valueOf(cArr[i2]));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R on(boolean[] zArr, Comparator<? super R> comparator, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) ha0.invoke(Boolean.valueOf(zArr[0]));
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                R invoke = ha0.invoke(Boolean.valueOf(zArr[i2]));
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return (R) obj;
    }

    public static final <T> boolean oo(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Boolean op(@NotNull boolean[] zArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[abstractC10696xN1.m(zArr.length)]);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short oq(@NotNull short[] sArr, @NotNull VA0<? super Short, ? super Short, Short> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                s2 = va0.i(Short.valueOf(s2), Short.valueOf(sArr[i2])).shortValue();
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Short.valueOf(s2);
    }

    public static void or(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length >= 0) {
            int Ge = Ge(sArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    short s2 = sArr[i2];
                    sArr[i2] = sArr[Ge];
                    sArr[Ge] = s2;
                    Ge--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Float> os(float[] fArr, XA0<? super Integer, ? super Float, ? super Float, Float> xa0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (fArr.length == 0) {
            return C8222nF.H();
        }
        float f2 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f2));
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            f2 = xa0.P(Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(fArr[i2])).floatValue();
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    public static final int ot(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Integer num = null;
        boolean z = false;
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                if (!z) {
                    num = Integer.valueOf(i2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(num, "null cannot be cast to non-null type kotlin.Int");
            return num.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final float[] ou(@NotNull float[] fArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return new float[0];
        }
        return C4788Ye.i1(fArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final short[] ov(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        C6562gT0.o(copyOf, "copyOf(...)");
        Pu(copyOf);
        return copyOf;
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int ow(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Integer> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (byte b2 : bArr) {
            i2 += ha0.invoke(Byte.valueOf(b2)).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int ox(char[] cArr, HA0<? super Character, C7162ix2> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (char c2 : cArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(Character.valueOf(c2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final List<Short> oy(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            if (!ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Short> oz(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return (Set) Ay(sArr, new LinkedHashSet(C8683p81.j(sArr.length)));
    }

    public static final boolean p5(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K> Map<K, Long> p6(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends K> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(jArr.length), 16));
        for (long j2 : jArr) {
            linkedHashMap.put(ha0.invoke(Long.valueOf(j2)), Long.valueOf(j2));
        }
        return linkedHashMap;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <V, M extends Map<? super Boolean, ? super V>> M p7(boolean[] zArr, M m2, HA0<? super Boolean, ? extends V> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "valueSelector");
        for (boolean z : zArr) {
            m2.put(Boolean.valueOf(z), ha0.invoke(Boolean.valueOf(z)));
        }
        return m2;
    }

    @XP0
    public static final float p8(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return fArr[4];
    }

    @NotNull
    public static final List<Character> p9(@NotNull char[] cArr, int i2) {
        C6562gT0.p(cArr, "<this>");
        if (i2 >= 0) {
            return Px(cArr, C5075aO1.u(cArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<C4180Rx1<Double, Double>> pA(@NotNull double[] dArr, @NotNull double[] dArr2) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(dArr2, "other");
        int min = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(Double.valueOf(dArr[i2]), Double.valueOf(dArr2[i2])));
        }
        return arrayList;
    }

    @XP0
    public static final Short pa(short[] sArr, int i2) {
        C6562gT0.p(sArr, "<this>");
        return Ze(sArr, i2);
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C pb(@NotNull double[] dArr, @NotNull C c2, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                c2.add(Double.valueOf(d2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Double pc(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
        }
        return null;
    }

    public static final <R> R pd(@NotNull char[] cArr, R r2, @NotNull VA0<? super R, ? super Character, ? extends R> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (char c2 : cArr) {
            r2 = va0.i(r2, Character.valueOf(c2));
        }
        return r2;
    }

    public static final void pe(@NotNull boolean[] zArr, @NotNull VA0<? super Integer, ? super Boolean, C7458kA2> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "action");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            va0.i(Integer.valueOf(i3), Boolean.valueOf(zArr[i2]));
            i2++;
            i3++;
        }
    }

    @NotNull
    public static final <K> Map<K, List<Short>> pf(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends K> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s2 : sArr) {
            K invoke = ha0.invoke(Short.valueOf(s2));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Short.valueOf(s2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Double> pg(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Double> jz = jz(dArr);
        C9444sF.R0(jz, iterable);
        return jz;
    }

    public static /* synthetic */ String ph(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return gh(bArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @Nullable
    public static final Short pi(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> char pj(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            char c2 = cArr[0];
            int Ae = Ae(cArr);
            if (Ae != 0) {
                R invoke = ha0.invoke(Character.valueOf(c2));
                int i2 = 1;
                if (1 <= Ae) {
                    while (true) {
                        char c3 = cArr[i2];
                        R invoke2 = ha0.invoke(Character.valueOf(c3));
                        if (invoke.compareTo(invoke2) < 0) {
                            c2 = c3;
                            invoke = invoke2;
                        }
                        if (i2 == Ae) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return c2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Double pk(boolean[] zArr, HA0<? super Boolean, Double> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = ha0.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                doubleValue = Math.max(doubleValue, ha0.invoke(Boolean.valueOf(zArr[i2])).doubleValue());
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float pl(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                float f3 = fArr[i2];
                if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) < 0) {
                    f2 = f3;
                }
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R pm(double[] dArr, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            R invoke = ha0.invoke(Double.valueOf(dArr[0]));
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    R invoke2 = ha0.invoke(Double.valueOf(dArr[i2]));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte pn(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                byte b3 = bArr[i2];
                if (b2 > b3) {
                    b2 = b3;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Byte.valueOf(b2);
    }

    public static final <T> boolean po(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Byte pp(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return qp(bArr, AbstractC10696xN1.X);
    }

    public static final byte pq(@NotNull byte[] bArr, @NotNull VA0<? super Byte, ? super Byte, Byte> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        int ze = ze(bArr);
        if (ze >= 0) {
            byte b2 = bArr[ze];
            for (int i2 = ze - 1; i2 >= 0; i2--) {
                b2 = va0.i(Byte.valueOf(bArr[i2]), Byte.valueOf(b2)).byteValue();
            }
            return b2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    public static void pr(@NotNull short[] sArr, int i2, int i3) {
        C6562gT0.p(sArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, sArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                short s2 = sArr[i2];
                sArr[i2] = sArr[i5];
                sArr[i5] = s2;
                i5--;
                i2++;
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Integer> ps(int[] iArr, XA0<? super Integer, ? super Integer, ? super Integer, Integer> xa0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (iArr.length == 0) {
            return C8222nF.H();
        }
        int i2 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i2));
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            i2 = xa0.P(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(iArr[i3])).intValue();
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static long pt(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length == 1) {
                return jArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static int[] pu(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(collection, "indices");
        int[] iArr2 = new int[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            iArr2[i2] = iArr[num.intValue()];
            i2++;
        }
        return iArr2;
    }

    @NotNull
    public static final <T> T[] pv(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        C6562gT0.o(tArr2, "copyOf(...)");
        C4788Ye.h4(tArr2, comparator);
        return tArr2;
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int pw(@NotNull char[] cArr, @NotNull HA0<? super Character, Integer> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (char c2 : cArr) {
            i2 += ha0.invoke(Character.valueOf(c2)).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int px(double[] dArr, HA0<? super Double, C7162ix2> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (double d2 : dArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(Double.valueOf(d2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final List<Boolean> py(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (!ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Boolean> pz(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return (Set) By(zArr, new LinkedHashSet(C8683p81.j(zArr.length)));
    }

    public static final boolean q5(@NotNull double[] dArr) {
        boolean z;
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <K, V> Map<K, V> q6(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends K> ha0, @NotNull HA0<? super Long, ? extends V> ha02) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(jArr.length), 16));
        for (long j2 : jArr) {
            linkedHashMap.put(ha0.invoke(Long.valueOf(j2)), ha02.invoke(Long.valueOf(j2)));
        }
        return linkedHashMap;
    }

    public static final double q7(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (byte b2 : bArr) {
            d2 += b2;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @XP0
    public static final int q8(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return iArr[4];
    }

    @NotNull
    public static final List<Double> q9(@NotNull double[] dArr, int i2) {
        C6562gT0.p(dArr, "<this>");
        if (i2 >= 0) {
            return Qx(dArr, C5075aO1.u(dArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <V> List<V> qA(@NotNull double[] dArr, @NotNull double[] dArr2, @NotNull VA0<? super Double, ? super Double, ? extends V> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(dArr2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Double.valueOf(dArr[i2]), Double.valueOf(dArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> qa(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C qb(@NotNull float[] fArr, @NotNull C c2, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                c2.add(Float.valueOf(f2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Float qc(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R qd(@NotNull double[] dArr, R r2, @NotNull VA0<? super R, ? super Double, ? extends R> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (double d2 : dArr) {
            r2 = va0.i(r2, Double.valueOf(d2));
        }
        return r2;
    }

    @NotNull
    public static C11197zR0 qe(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return new C11197zR0(0, ze(bArr));
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> qf(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends K> ha0, @NotNull HA0<? super Short, ? extends V> ha02) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s2 : sArr) {
            K invoke = ha0.invoke(Short.valueOf(s2));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Short.valueOf(s2)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Float> qg(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Float> kz = kz(fArr);
        C9444sF.R0(kz, iterable);
        return kz;
    }

    public static /* synthetic */ String qh(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return hh(cArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @Nullable
    public static final Short qi(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            short s2 = sArr[length];
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                return Short.valueOf(s2);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return null;
            }
        }
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> double qj(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int Be = Be(dArr);
            if (Be != 0) {
                R invoke = ha0.invoke(Double.valueOf(d2));
                int i2 = 1;
                if (1 <= Be) {
                    while (true) {
                        double d3 = dArr[i2];
                        R invoke2 = ha0.invoke(Double.valueOf(d3));
                        if (invoke.compareTo(invoke2) < 0) {
                            d2 = d3;
                            invoke = invoke2;
                        }
                        if (i2 == Be) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float qk(byte[] bArr, HA0<? super Byte, Float> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Byte.valueOf(bArr[0])).floatValue();
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Byte.valueOf(bArr[i2])).floatValue());
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer ql(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int De = De(iArr);
        int i3 = 1;
        if (1 <= De) {
            while (true) {
                int i4 = iArr[i3];
                if (comparator.compare(Integer.valueOf(i2), Integer.valueOf(i4)) < 0) {
                    i2 = i4;
                }
                if (i3 == De) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R qm(float[] fArr, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            R invoke = ha0.invoke(Float.valueOf(fArr[0]));
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    R invoke2 = ha0.invoke(Float.valueOf(fArr[i2]));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character qn(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                char c3 = cArr[i2];
                if (C6562gT0.t(c2, c3) > 0) {
                    c2 = c3;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Character.valueOf(c2);
    }

    public static final boolean qo(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Byte qp(@NotNull byte[] bArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[abstractC10696xN1.m(bArr.length)]);
    }

    public static final char qq(@NotNull char[] cArr, @NotNull VA0<? super Character, ? super Character, Character> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Ae = Ae(cArr);
        if (Ae >= 0) {
            char c2 = cArr[Ae];
            for (int i2 = Ae - 1; i2 >= 0; i2--) {
                c2 = va0.i(Character.valueOf(cArr[i2]), Character.valueOf(c2)).charValue();
            }
            return c2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void qr(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length >= 0) {
            int He = He(zArr);
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    boolean z = zArr[i2];
                    zArr[i2] = zArr[He];
                    zArr[He] = z;
                    He--;
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Long> qs(long[] jArr, XA0<? super Integer, ? super Long, ? super Long, Long> xa0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (jArr.length == 0) {
            return C8222nF.H();
        }
        long j2 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j2));
        int length = jArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            j2 = xa0.P(Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(jArr[i2])).longValue();
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static final long qt(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Long l2 = null;
        boolean z = false;
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                if (!z) {
                    l2 = Long.valueOf(j2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(l2, "null cannot be cast to non-null type kotlin.Long");
            return l2.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static int[] qu(@NotNull int[] iArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return new int[0];
        }
        return C4788Ye.j1(iArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> qv(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Qv(bArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int qw(@NotNull double[] dArr, @NotNull HA0<? super Double, Integer> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (double d2 : dArr) {
            i2 += ha0.invoke(Double.valueOf(d2)).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int qx(float[] fArr, HA0<? super Float, C7162ix2> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (float f2 : fArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(Float.valueOf(f2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final boolean[] qy(@NotNull Boolean[] boolArr) {
        C6562gT0.p(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = boolArr[i2].booleanValue();
        }
        return zArr;
    }

    @NotNull
    public static final Set<Byte> qz(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) ty(bArr, new LinkedHashSet(C8683p81.j(bArr.length)));
            }
            return A22.f(Byte.valueOf(bArr[0]));
        }
        return B22.k();
    }

    public static final boolean r5(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T, K> Map<K, T> r6(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(tArr.length), 16));
        for (T t : tArr) {
            linkedHashMap.put(ha0.invoke(t), t);
        }
        return linkedHashMap;
    }

    public static final double r7(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (double d3 : dArr) {
            d2 += d3;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @XP0
    public static final long r8(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return jArr[4];
    }

    @NotNull
    public static final List<Float> r9(@NotNull float[] fArr, int i2) {
        C6562gT0.p(fArr, "<this>");
        if (i2 >= 0) {
            return Rx(fArr, C5075aO1.u(fArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<C4180Rx1<Double, R>> rA(@NotNull double[] dArr, @NotNull R[] rArr) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            double d2 = dArr[i2];
            arrayList.add(C6670gv2.a(Double.valueOf(d2), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> ra(@NotNull char[] cArr, @NotNull HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C rb(@NotNull int[] iArr, @NotNull C c2, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                c2.add(Integer.valueOf(i2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Float rc(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
        }
        return null;
    }

    public static final <R> R rd(@NotNull float[] fArr, R r2, @NotNull VA0<? super R, ? super Float, ? extends R> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (float f2 : fArr) {
            r2 = va0.i(r2, Float.valueOf(f2));
        }
        return r2;
    }

    @NotNull
    public static final C11197zR0 re(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return new C11197zR0(0, Ae(cArr));
    }

    @NotNull
    public static final <K> Map<K, List<Boolean>> rf(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends K> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z : zArr) {
            K invoke = ha0.invoke(Boolean.valueOf(z));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Integer> rg(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Integer> lz = lz(iArr);
        C9444sF.R0(lz, iterable);
        return lz;
    }

    public static /* synthetic */ String rh(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return ih(dArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @NotNull
    public static final <R> List<R> ri(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(ha0.invoke(Byte.valueOf(b2)));
        }
        return arrayList;
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> float rj(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length != 0) {
            float f2 = fArr[0];
            int Ce = Ce(fArr);
            if (Ce != 0) {
                R invoke = ha0.invoke(Float.valueOf(f2));
                int i2 = 1;
                if (1 <= Ce) {
                    while (true) {
                        float f3 = fArr[i2];
                        R invoke2 = ha0.invoke(Float.valueOf(f3));
                        if (invoke.compareTo(invoke2) < 0) {
                            f2 = f3;
                            invoke = invoke2;
                        }
                        if (i2 == Ce) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return f2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float rk(char[] cArr, HA0<? super Character, Float> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Character.valueOf(cArr[0])).floatValue();
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Character.valueOf(cArr[i2])).floatValue());
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long rl(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                long j3 = jArr[i2];
                if (comparator.compare(Long.valueOf(j2), Long.valueOf(j3)) < 0) {
                    j2 = j3;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Long.valueOf(j2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R rm(int[] iArr, HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            R invoke = ha0.invoke(Integer.valueOf(iArr[0]));
            int De = De(iArr);
            int i2 = 1;
            if (1 <= De) {
                while (true) {
                    R invoke2 = ha0.invoke(Integer.valueOf(iArr[i2]));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == De) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T rn(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                T t2 = tArr[i2];
                if (t.compareTo(t2) > 0) {
                    t = t2;
                }
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return t;
    }

    public static final boolean ro(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Character rp(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        return sp(cArr, AbstractC10696xN1.X);
    }

    public static final double rq(@NotNull double[] dArr, @NotNull VA0<? super Double, ? super Double, Double> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Be = Be(dArr);
        if (Be >= 0) {
            double d2 = dArr[Be];
            for (int i2 = Be - 1; i2 >= 0; i2--) {
                d2 = va0.i(Double.valueOf(dArr[i2]), Double.valueOf(d2)).doubleValue();
            }
            return d2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @InterfaceC6480g82(version = "1.4")
    public static final void rr(@NotNull boolean[] zArr, int i2, int i3) {
        C6562gT0.p(zArr, "<this>");
        AbstractC8896q1.X.d(i2, i3, zArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 != i4) {
            int i5 = i3 - 1;
            while (i2 < i4) {
                boolean z = zArr[i2];
                zArr[i2] = zArr[i5];
                zArr[i5] = z;
                i5--;
                i2++;
            }
        }
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> rs(@NotNull T[] tArr, @NotNull XA0<? super Integer, ? super S, ? super T, ? extends S> xa0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (tArr.length == 0) {
            return C8222nF.H();
        }
        S s2 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s2);
        int length = tArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            s2 = xa0.P(Integer.valueOf(i2), s2, (Object) tArr[i2]);
            arrayList.add(s2);
        }
        return arrayList;
    }

    public static final <T> T rt(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static long[] ru(@NotNull long[] jArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(collection, "indices");
        long[] jArr2 = new long[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            jArr2[i2] = jArr[num.intValue()];
            i2++;
        }
        return jArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> rv(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Rv(cArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int rw(@NotNull float[] fArr, @NotNull HA0<? super Float, Integer> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (float f2 : fArr) {
            i2 += ha0.invoke(Float.valueOf(f2)).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int rx(int[] iArr, HA0<? super Integer, C7162ix2> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (int i2 : iArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(Integer.valueOf(i2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final byte[] ry(@NotNull Byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = bArr[i2].byteValue();
        }
        return bArr2;
    }

    @NotNull
    public static final Set<Character> rz(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) uy(cArr, new LinkedHashSet(C8683p81.j(C5075aO1.B(cArr.length, 128))));
            }
            return A22.f(Character.valueOf(cArr[0]));
        }
        return B22.k();
    }

    public static final boolean s5(@NotNull float[] fArr) {
        boolean z;
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> s6(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends K> ha0, @NotNull HA0<? super T, ? extends V> ha02) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(tArr.length), 16));
        for (T t : tArr) {
            linkedHashMap.put(ha0.invoke(t), ha02.invoke(t));
        }
        return linkedHashMap;
    }

    public static final double s7(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (float f2 : fArr) {
            d2 += f2;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @XP0
    public static final <T> T s8(T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return tArr[4];
    }

    @NotNull
    public static final List<Integer> s9(@NotNull int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        if (i2 >= 0) {
            return Sx(iArr, C5075aO1.u(iArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, V> List<V> sA(@NotNull double[] dArr, @NotNull R[] rArr, @NotNull VA0<? super Double, ? super R, ? extends V> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Double.valueOf(dArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> sa(@NotNull double[] dArr, @NotNull HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C sb(@NotNull long[] jArr, @NotNull C c2, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                c2.add(Long.valueOf(j2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Integer sc(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <R> R sd(@NotNull int[] iArr, R r2, @NotNull VA0<? super R, ? super Integer, ? extends R> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (int i2 : iArr) {
            r2 = va0.i(r2, Integer.valueOf(i2));
        }
        return r2;
    }

    @NotNull
    public static final C11197zR0 se(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return new C11197zR0(0, Be(dArr));
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> sf(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends K> ha0, @NotNull HA0<? super Boolean, ? extends V> ha02) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z : zArr) {
            K invoke = ha0.invoke(Boolean.valueOf(z));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(ha02.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Set<Long> sg(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Long> mz = mz(jArr);
        C9444sF.R0(mz, iterable);
        return mz;
    }

    public static /* synthetic */ String sh(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return jh(fArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @NotNull
    public static final <R> List<R> si(@NotNull char[] cArr, @NotNull HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c2 : cArr) {
            arrayList.add(ha0.invoke(Character.valueOf(c2)));
        }
        return arrayList;
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> int sj(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int De = De(iArr);
            if (De != 0) {
                R invoke = ha0.invoke(Integer.valueOf(i2));
                int i3 = 1;
                if (1 <= De) {
                    while (true) {
                        int i4 = iArr[i3];
                        R invoke2 = ha0.invoke(Integer.valueOf(i4));
                        if (invoke.compareTo(invoke2) < 0) {
                            i2 = i4;
                            invoke = invoke2;
                        }
                        if (i3 == De) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            return i2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float sk(double[] dArr, HA0<? super Double, Float> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Double.valueOf(dArr[0])).floatValue();
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Double.valueOf(dArr[i2])).floatValue());
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T sl(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                T t2 = tArr[i2];
                if (comparator.compare(t, t2) < 0) {
                    t = t2;
                }
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return t;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R sm(long[] jArr, HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            R invoke = ha0.invoke(Long.valueOf(jArr[0]));
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    R invoke2 = ha0.invoke(Long.valueOf(jArr[i2]));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double sn(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                d2 = Math.min(d2, dArr[i2]);
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(d2);
    }

    public static final boolean so(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Character sp(@NotNull char[] cArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[abstractC10696xN1.m(cArr.length)]);
    }

    public static final float sq(@NotNull float[] fArr, @NotNull VA0<? super Float, ? super Float, Float> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Ce = Ce(fArr);
        if (Ce >= 0) {
            float f2 = fArr[Ce];
            for (int i2 = Ce - 1; i2 >= 0; i2--) {
                f2 = va0.i(Float.valueOf(fArr[i2]), Float.valueOf(f2)).floatValue();
            }
            return f2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Byte> sr(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return C8222nF.H();
        }
        List<Byte> Yy = Yy(bArr);
        C9930uF.r1(Yy);
        return Yy;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Short> ss(short[] sArr, XA0<? super Integer, ? super Short, ? super Short, Short> xa0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (sArr.length == 0) {
            return C8222nF.H();
        }
        short s2 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s2));
        int length = sArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            s2 = xa0.P(Integer.valueOf(i2), Short.valueOf(s2), Short.valueOf(sArr[i2])).shortValue();
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    public static final <T> T st(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : tArr) {
            if (ha0.invoke(t2).booleanValue()) {
                if (!z) {
                    z = true;
                    t = t2;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static long[] su(@NotNull long[] jArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return new long[0];
        }
        return C4788Ye.k1(jArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sv(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Sv(dArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int sw(@NotNull int[] iArr, @NotNull HA0<? super Integer, Integer> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += ha0.invoke(Integer.valueOf(i3)).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int sx(long[] jArr, HA0<? super Long, C7162ix2> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (long j2 : jArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(Long.valueOf(j2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final char[] sy(@NotNull Character[] chArr) {
        C6562gT0.p(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = chArr[i2].charValue();
        }
        return cArr;
    }

    @NotNull
    public static final Set<Double> sz(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) vy(dArr, new LinkedHashSet(C8683p81.j(dArr.length)));
            }
            return A22.f(Double.valueOf(dArr[0]));
        }
        return B22.k();
    }

    public static final boolean t5(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K> Map<K, Short> t6(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends K> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(sArr.length), 16));
        for (short s2 : sArr) {
            linkedHashMap.put(ha0.invoke(Short.valueOf(s2)), Short.valueOf(s2));
        }
        return linkedHashMap;
    }

    public static final double t7(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (int i3 : iArr) {
            d2 += i3;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @XP0
    public static final short t8(short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return sArr[4];
    }

    @NotNull
    public static final List<Long> t9(@NotNull long[] jArr, int i2) {
        C6562gT0.p(jArr, "<this>");
        if (i2 >= 0) {
            return Tx(jArr, C5075aO1.u(jArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<C4180Rx1<Float, R>> tA(@NotNull float[] fArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(Float.valueOf(fArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> ta(@NotNull float[] fArr, @NotNull HA0<? super Float, Boolean> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            if (ha0.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C tb(@NotNull T[] tArr, @NotNull C c2, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                c2.add(t);
            }
        }
        return c2;
    }

    @Nullable
    public static final Integer tc(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                return Integer.valueOf(i2);
            }
        }
        return null;
    }

    public static final <R> R td(@NotNull long[] jArr, R r2, @NotNull VA0<? super R, ? super Long, ? extends R> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (long j2 : jArr) {
            r2 = va0.i(r2, Long.valueOf(j2));
        }
        return r2;
    }

    @NotNull
    public static final C11197zR0 te(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return new C11197zR0(0, Ce(fArr));
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Byte>>> M tf(@NotNull byte[] bArr, @NotNull M m2, @NotNull HA0<? super Byte, ? extends K> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (byte b2 : bArr) {
            K invoke = ha0.invoke(Byte.valueOf(b2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(Byte.valueOf(b2));
        }
        return m2;
    }

    @NotNull
    public static final <T> Set<T> tg(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<T> nz = nz(tArr);
        C9444sF.R0(nz, iterable);
        return nz;
    }

    public static /* synthetic */ String th(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return kh(iArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @NotNull
    public static final <R> List<R> ti(@NotNull double[] dArr, @NotNull HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d2 : dArr) {
            arrayList.add(ha0.invoke(Double.valueOf(d2)));
        }
        return arrayList;
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> long tj(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length != 0) {
            long j2 = jArr[0];
            int Ee = Ee(jArr);
            if (Ee != 0) {
                R invoke = ha0.invoke(Long.valueOf(j2));
                int i2 = 1;
                if (1 <= Ee) {
                    while (true) {
                        long j3 = jArr[i2];
                        R invoke2 = ha0.invoke(Long.valueOf(j3));
                        if (invoke.compareTo(invoke2) < 0) {
                            j2 = j3;
                            invoke = invoke2;
                        }
                        if (i2 == Ee) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return j2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float tk(float[] fArr, HA0<? super Float, Float> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Float.valueOf(fArr[0])).floatValue();
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Float.valueOf(fArr[i2])).floatValue());
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short tl(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                short s3 = sArr[i2];
                if (comparator.compare(Short.valueOf(s2), Short.valueOf(s3)) < 0) {
                    s2 = s3;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Short.valueOf(s2);
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R tm(T[] tArr, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            R invoke = ha0.invoke(tArr[0]);
            int Fe = Fe(tArr);
            int i2 = 1;
            if (1 <= Fe) {
                while (true) {
                    R invoke2 = ha0.invoke(tArr[i2]);
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Fe) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double tn(@NotNull Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        int Fe = Fe(dArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                doubleValue = Math.min(doubleValue, dArr[i2].doubleValue());
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    public static final boolean to(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Double tp(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        return up(dArr, AbstractC10696xN1.X);
    }

    public static final int tq(@NotNull int[] iArr, @NotNull VA0<? super Integer, ? super Integer, Integer> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        int De = De(iArr);
        if (De >= 0) {
            int i2 = iArr[De];
            for (int i3 = De - 1; i3 >= 0; i3--) {
                i2 = va0.i(Integer.valueOf(iArr[i3]), Integer.valueOf(i2)).intValue();
            }
            return i2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Character> tr(@NotNull char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return C8222nF.H();
        }
        List<Character> Zy = Zy(cArr);
        C9930uF.r1(Zy);
        return Zy;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final List<Boolean> ts(boolean[] zArr, XA0<? super Integer, ? super Boolean, ? super Boolean, Boolean> xa0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(xa0, "operation");
        if (zArr.length == 0) {
            return C8222nF.H();
        }
        boolean z = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z));
        int length = zArr.length;
        int i2 = 1;
        while (i2 < length) {
            Boolean P = xa0.P(Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(zArr[i2]));
            boolean booleanValue = P.booleanValue();
            arrayList.add(P);
            i2++;
            z = booleanValue;
        }
        return arrayList;
    }

    public static short tt(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length == 1) {
                return sArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <T> T[] tu(@NotNull T[] tArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(collection, "indices");
        T[] tArr2 = (T[]) C4594We.a(tArr, collection.size());
        int i2 = 0;
        for (Integer num : collection) {
            tArr2[i2] = tArr[num.intValue()];
            i2++;
        }
        return tArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> tv(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Tv(fArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int tw(@NotNull long[] jArr, @NotNull HA0<? super Long, Integer> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (long j2 : jArr) {
            i2 += ha0.invoke(Long.valueOf(j2)).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final <T> int tx(T[] tArr, HA0<? super T, C7162ix2> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (T t : tArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(t).p0());
        }
        return n2;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C ty(@NotNull byte[] bArr, @NotNull C c2) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (byte b2 : bArr) {
            c2.add(Byte.valueOf(b2));
        }
        return c2;
    }

    @NotNull
    public static final Set<Float> tz(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) wy(fArr, new LinkedHashSet(C8683p81.j(fArr.length)));
            }
            return A22.f(Float.valueOf(fArr[0]));
        }
        return B22.k();
    }

    public static boolean u5(@NotNull int[] iArr) {
        boolean z;
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <K, V> Map<K, V> u6(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends K> ha0, @NotNull HA0<? super Short, ? extends V> ha02) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(sArr.length), 16));
        for (short s2 : sArr) {
            linkedHashMap.put(ha0.invoke(Short.valueOf(s2)), ha02.invoke(Short.valueOf(s2)));
        }
        return linkedHashMap;
    }

    public static final double u7(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (long j2 : jArr) {
            d2 += j2;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @XP0
    public static final boolean u8(boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return zArr[4];
    }

    @NotNull
    public static final <T> List<T> u9(@NotNull T[] tArr, int i2) {
        C6562gT0.p(tArr, "<this>");
        if (i2 >= 0) {
            return Ux(tArr, C5075aO1.u(tArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, V> List<V> uA(@NotNull float[] fArr, @NotNull Iterable<? extends R> iterable, @NotNull VA0<? super Float, ? super R, ? extends V> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(iterable, "other");
        C6562gT0.p(va0, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i2 >= length) {
                break;
            }
            arrayList.add(va0.i(Float.valueOf(fArr[i2]), obj));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> ua(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C ub(@NotNull short[] sArr, @NotNull C c2, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                c2.add(Short.valueOf(s2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Long uc(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ud(@NotNull T[] tArr, R r2, @NotNull VA0<? super R, ? super T, ? extends R> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (Manifest manifest : tArr) {
            r2 = va0.i(r2, manifest);
        }
        return r2;
    }

    @NotNull
    public static C11197zR0 ue(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return new C11197zR0(0, De(iArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M uf(@NotNull byte[] bArr, @NotNull M m2, @NotNull HA0<? super Byte, ? extends K> ha0, @NotNull HA0<? super Byte, ? extends V> ha02) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (byte b2 : bArr) {
            K invoke = ha0.invoke(Byte.valueOf(b2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Byte.valueOf(b2)));
        }
        return m2;
    }

    @NotNull
    public static final Set<Short> ug(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Short> oz = oz(sArr);
        C9444sF.R0(oz, iterable);
        return oz;
    }

    public static /* synthetic */ String uh(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return lh(jArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @NotNull
    public static final <R> List<R> ui(@NotNull float[] fArr, @NotNull HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(ha0.invoke(Float.valueOf(f2)));
        }
        return arrayList;
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T uj(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length != 0) {
            T t = tArr[0];
            int Fe = Fe(tArr);
            if (Fe != 0) {
                R invoke = ha0.invoke(t);
                int i2 = 1;
                if (1 <= Fe) {
                    while (true) {
                        T t2 = tArr[i2];
                        R invoke2 = ha0.invoke(t2);
                        if (invoke.compareTo(invoke2) < 0) {
                            t = t2;
                            invoke = invoke2;
                        }
                        if (i2 == Fe) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float uk(int[] iArr, HA0<? super Integer, Float> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Integer.valueOf(iArr[0])).floatValue();
        int De = De(iArr);
        int i2 = 1;
        if (1 <= De) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Integer.valueOf(iArr[i2])).floatValue());
                if (i2 == De) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final byte ul(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (bArr.length != 0) {
            byte b2 = bArr[0];
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    byte b3 = bArr[i2];
                    if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) < 0) {
                        b2 = b3;
                    }
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return b2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R um(short[] sArr, HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            R invoke = ha0.invoke(Short.valueOf(sArr[0]));
            int Ge = Ge(sArr);
            int i2 = 1;
            if (1 <= Ge) {
                while (true) {
                    R invoke2 = ha0.invoke(Short.valueOf(sArr[i2]));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == Ge) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float un(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                f2 = Math.min(f2, fArr[i2]);
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final byte[] uo(byte[] bArr, HA0<? super Byte, C7458kA2> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (byte b2 : bArr) {
            ha0.invoke(Byte.valueOf(b2));
        }
        return bArr;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Double up(@NotNull double[] dArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[abstractC10696xN1.m(dArr.length)]);
    }

    public static final long uq(@NotNull long[] jArr, @NotNull VA0<? super Long, ? super Long, Long> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Ee = Ee(jArr);
        if (Ee >= 0) {
            long j2 = jArr[Ee];
            for (int i2 = Ee - 1; i2 >= 0; i2--) {
                j2 = va0.i(Long.valueOf(jArr[i2]), Long.valueOf(j2)).longValue();
            }
            return j2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Double> ur(@NotNull double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return C8222nF.H();
        }
        List<Double> az = az(dArr);
        C9930uF.r1(az);
        return az;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> us(byte[] bArr, R r2, VA0<? super R, ? super Byte, ? extends R> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (bArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r2);
        for (byte b2 : bArr) {
            r2 = va0.i(r2, Byte.valueOf(b2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final short ut(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Short sh = null;
        boolean z = false;
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                if (!z) {
                    sh = Short.valueOf(s2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(sh, "null cannot be cast to non-null type kotlin.Short");
            return sh.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <T> T[] uu(@NotNull T[] tArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return (T[]) C4788Ye.l1(tArr, 0, 0);
        }
        return (T[]) C4788Ye.l1(tArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> uv(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Uv(iArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final <T> int uw(@NotNull T[] tArr, @NotNull HA0<? super T, Integer> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (T t : tArr) {
            i2 += ha0.invoke(t).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int ux(short[] sArr, HA0<? super Short, C7162ix2> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (short s2 : sArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(Short.valueOf(s2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C uy(@NotNull char[] cArr, @NotNull C c2) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (char c3 : cArr) {
            c2.add(Character.valueOf(c3));
        }
        return c2;
    }

    @NotNull
    public static final Set<Integer> uz(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) xy(iArr, new LinkedHashSet(C8683p81.j(iArr.length)));
            }
            return A22.f(Integer.valueOf(iArr[0]));
        }
        return B22.k();
    }

    public static final boolean v5(@NotNull int[] iArr, @NotNull HA0<? super Integer, Boolean> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (int i2 : iArr) {
            if (ha0.invoke(Integer.valueOf(i2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K> Map<K, Boolean> v6(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends K> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(zArr.length), 16));
        for (boolean z : zArr) {
            linkedHashMap.put(ha0.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    public static final double v7(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (short s2 : sArr) {
            d2 += s2;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    public static boolean v8(@NotNull byte[] bArr, byte b2) {
        C6562gT0.p(bArr, "<this>");
        if (Mf(bArr, b2) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final List<Short> v9(@NotNull short[] sArr, int i2) {
        C6562gT0.p(sArr, "<this>");
        if (i2 >= 0) {
            return Vx(sArr, C5075aO1.u(sArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<C4180Rx1<Float, Float>> vA(@NotNull float[] fArr, @NotNull float[] fArr2) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(fArr2, "other");
        int min = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(C6670gv2.a(Float.valueOf(fArr[i2]), Float.valueOf(fArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> va(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C vb(@NotNull boolean[] zArr, @NotNull C c2, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c2, "destination");
        C6562gT0.p(ha0, "predicate");
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                c2.add(Boolean.valueOf(z));
            }
        }
        return c2;
    }

    @Nullable
    public static final Long vc(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                return Long.valueOf(j2);
            }
        }
        return null;
    }

    public static final <R> R vd(@NotNull short[] sArr, R r2, @NotNull VA0<? super R, ? super Short, ? extends R> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (short s2 : sArr) {
            r2 = va0.i(r2, Short.valueOf(s2));
        }
        return r2;
    }

    @NotNull
    public static C11197zR0 ve(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return new C11197zR0(0, Ee(jArr));
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M vf(@NotNull char[] cArr, @NotNull M m2, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (char c2 : cArr) {
            K invoke = ha0.invoke(Character.valueOf(c2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(c2));
        }
        return m2;
    }

    @NotNull
    public static final Set<Boolean> vg(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(iterable, "other");
        Set<Boolean> pz = pz(zArr);
        C9444sF.R0(pz, iterable);
        return pz;
    }

    public static /* synthetic */ String vh(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return mh(objArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @NotNull
    public static final <R> List<R> vi(@NotNull int[] iArr, @NotNull HA0<? super Integer, ? extends R> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(ha0.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> short vj(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length != 0) {
            short s2 = sArr[0];
            int Ge = Ge(sArr);
            if (Ge != 0) {
                R invoke = ha0.invoke(Short.valueOf(s2));
                int i2 = 1;
                if (1 <= Ge) {
                    while (true) {
                        short s3 = sArr[i2];
                        R invoke2 = ha0.invoke(Short.valueOf(s3));
                        if (invoke.compareTo(invoke2) < 0) {
                            s2 = s3;
                            invoke = invoke2;
                        }
                        if (i2 == Ge) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return s2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float vk(long[] jArr, HA0<? super Long, Float> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Long.valueOf(jArr[0])).floatValue();
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Long.valueOf(jArr[i2])).floatValue());
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final char vl(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (cArr.length != 0) {
            char c2 = cArr[0];
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    char c3 = cArr[i2];
                    if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) < 0) {
                        c2 = c3;
                    }
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return c2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R vm(boolean[] zArr, HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            R invoke = ha0.invoke(Boolean.valueOf(zArr[0]));
            int He = He(zArr);
            int i2 = 1;
            if (1 <= He) {
                while (true) {
                    R invoke2 = ha0.invoke(Boolean.valueOf(zArr[i2]));
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                    }
                    if (i2 == He) {
                        break;
                    }
                    i2++;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float vn(@NotNull Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        int Fe = Fe(fArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                floatValue = Math.min(floatValue, fArr[i2].floatValue());
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final char[] vo(char[] cArr, HA0<? super Character, C7458kA2> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (char c2 : cArr) {
            ha0.invoke(Character.valueOf(c2));
        }
        return cArr;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Float vp(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        return wp(fArr, AbstractC10696xN1.X);
    }

    public static final <S, T extends S> S vq(@NotNull T[] tArr, @NotNull VA0<? super T, ? super S, ? extends S> va0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Fe = Fe(tArr);
        if (Fe >= 0) {
            Object obj = (S) tArr[Fe];
            for (int i2 = Fe - 1; i2 >= 0; i2--) {
                obj = (S) va0.i((Object) tArr[i2], obj);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Float> vr(@NotNull float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return C8222nF.H();
        }
        List<Float> bz = bz(fArr);
        C9930uF.r1(bz);
        return bz;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> vs(char[] cArr, R r2, VA0<? super R, ? super Character, ? extends R> va0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (cArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r2);
        for (char c2 : cArr) {
            r2 = va0.i(r2, Character.valueOf(c2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final boolean vt(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length == 1) {
                return zArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static short[] vu(@NotNull short[] sArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(collection, "indices");
        short[] sArr2 = new short[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            sArr2[i2] = sArr[num.intValue()];
            i2++;
        }
        return sArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> vv(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Vv(jArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int vw(@NotNull short[] sArr, @NotNull HA0<? super Short, Integer> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (short s2 : sArr) {
            i2 += ha0.invoke(Short.valueOf(s2)).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfUInt")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final int vx(boolean[] zArr, HA0<? super Boolean, C7162ix2> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int n2 = C7162ix2.n(0);
        for (boolean z : zArr) {
            n2 = C7162ix2.n(n2 + ha0.invoke(Boolean.valueOf(z)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C vy(@NotNull double[] dArr, @NotNull C c2) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (double d2 : dArr) {
            c2.add(Double.valueOf(d2));
        }
        return c2;
    }

    @NotNull
    public static final Set<Long> vz(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) yy(jArr, new LinkedHashSet(C8683p81.j(jArr.length)));
            }
            return A22.f(Long.valueOf(jArr[0]));
        }
        return B22.k();
    }

    public static boolean w5(@NotNull long[] jArr) {
        boolean z;
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <K, V> Map<K, V> w6(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends K> ha0, @NotNull HA0<? super Boolean, ? extends V> ha02) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(zArr.length), 16));
        for (boolean z : zArr) {
            linkedHashMap.put(ha0.invoke(Boolean.valueOf(z)), ha02.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @InterfaceC8046mW0(name = "averageOfByte")
    public static final double w7(@NotNull Byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Byte b2 : bArr) {
            d2 += b2.byteValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    public static boolean w8(@NotNull char[] cArr, char c2) {
        C6562gT0.p(cArr, "<this>");
        if (Nf(cArr, c2) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final List<Boolean> w9(@NotNull boolean[] zArr, int i2) {
        C6562gT0.p(zArr, "<this>");
        if (i2 >= 0) {
            return Wx(zArr, C5075aO1.u(zArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <V> List<V> wA(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull VA0<? super Float, ? super Float, ? extends V> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(fArr2, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Float.valueOf(fArr[i2]), Float.valueOf(fArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> wa(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @XP0
    public static final Boolean wb(boolean[] zArr, HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @Nullable
    public static final <T> T wc(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <R> R wd(@NotNull boolean[] zArr, R r2, @NotNull VA0<? super R, ? super Boolean, ? extends R> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        for (boolean z : zArr) {
            r2 = va0.i(r2, Boolean.valueOf(z));
        }
        return r2;
    }

    @NotNull
    public static final <T> C11197zR0 we(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        return new C11197zR0(0, Fe(tArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M wf(@NotNull char[] cArr, @NotNull M m2, @NotNull HA0<? super Character, ? extends K> ha0, @NotNull HA0<? super Character, ? extends V> ha02) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (char c2 : cArr) {
            K invoke = ha0.invoke(Character.valueOf(c2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Character.valueOf(c2)));
        }
        return m2;
    }

    @XP0
    public static final boolean wg(byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String wh(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return nh(sArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @NotNull
    public static final <R> List<R> wi(@NotNull long[] jArr, @NotNull HA0<? super Long, ? extends R> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(ha0.invoke(Long.valueOf(j2)));
        }
        return arrayList;
    }

    @InterfaceC8046mW0(name = "maxByOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean wj(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length != 0) {
            boolean z = zArr[0];
            int He = He(zArr);
            if (He != 0) {
                R invoke = ha0.invoke(Boolean.valueOf(z));
                int i2 = 1;
                if (1 <= He) {
                    while (true) {
                        boolean z2 = zArr[i2];
                        R invoke2 = ha0.invoke(Boolean.valueOf(z2));
                        if (invoke.compareTo(invoke2) < 0) {
                            z = z2;
                            invoke = invoke2;
                        }
                        if (i2 == He) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            return z;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <T> Float wk(T[] tArr, HA0<? super T, Float> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(tArr[0]).floatValue();
        int Fe = Fe(tArr);
        int i2 = 1;
        if (1 <= Fe) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(tArr[i2]).floatValue());
                if (i2 == Fe) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final double wl(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (dArr.length != 0) {
            double d2 = dArr[0];
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    double d3 = dArr[i2];
                    if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) < 0) {
                        d2 = d3;
                    }
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return d2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R wm(byte[] bArr, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Byte.valueOf(bArr[0]));
        int ze = ze(bArr);
        int i2 = 1;
        if (1 <= ze) {
            while (true) {
                R invoke2 = ha0.invoke(Byte.valueOf(bArr[i2]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == ze) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer wn(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int De = De(iArr);
        int i3 = 1;
        if (1 <= De) {
            while (true) {
                int i4 = iArr[i3];
                if (i2 > i4) {
                    i2 = i4;
                }
                if (i3 == De) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final double[] wo(double[] dArr, HA0<? super Double, C7458kA2> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (double d2 : dArr) {
            ha0.invoke(Double.valueOf(d2));
        }
        return dArr;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Float wp(@NotNull float[] fArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[abstractC10696xN1.m(fArr.length)]);
    }

    public static final short wq(@NotNull short[] sArr, @NotNull VA0<? super Short, ? super Short, Short> va0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(va0, "operation");
        int Ge = Ge(sArr);
        if (Ge >= 0) {
            short s2 = sArr[Ge];
            for (int i2 = Ge - 1; i2 >= 0; i2--) {
                s2 = va0.i(Short.valueOf(sArr[i2]), Short.valueOf(s2)).shortValue();
            }
            return s2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Integer> wr(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return C8222nF.H();
        }
        List<Integer> cz = cz(iArr);
        C9930uF.r1(cz);
        return cz;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> ws(double[] dArr, R r2, VA0<? super R, ? super Double, ? extends R> va0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (dArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r2);
        for (double d2 : dArr) {
            r2 = va0.i(r2, Double.valueOf(d2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final boolean wt(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Boolean bool = null;
        boolean z = false;
        for (boolean z2 : zArr) {
            if (ha0.invoke(Boolean.valueOf(z2)).booleanValue()) {
                if (!z) {
                    bool = Boolean.valueOf(z2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            C6562gT0.n(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static short[] wu(@NotNull short[] sArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return new short[0];
        }
        return C4788Ye.m1(sArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> wv(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Wv(tArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final int ww(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Integer> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        int i2 = 0;
        for (boolean z : zArr) {
            i2 += ha0.invoke(Boolean.valueOf(z)).intValue();
        }
        return i2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long wx(byte[] bArr, HA0<? super Byte, C9860tx2> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (byte b2 : bArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(Byte.valueOf(b2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C wy(@NotNull float[] fArr, @NotNull C c2) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (float f2 : fArr) {
            c2.add(Float.valueOf(f2));
        }
        return c2;
    }

    @NotNull
    public static final <T> Set<T> wz(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) zy(tArr, new LinkedHashSet(C8683p81.j(tArr.length)));
            }
            return A22.f(tArr[0]);
        }
        return B22.k();
    }

    public static final boolean x5(@NotNull long[] jArr, @NotNull HA0<? super Long, Boolean> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (long j2 : jArr) {
            if (ha0.invoke(Long.valueOf(j2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Byte>> M x6(@NotNull byte[] bArr, @NotNull M m2, @NotNull HA0<? super Byte, ? extends K> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (byte b2 : bArr) {
            m2.put(ha0.invoke(Byte.valueOf(b2)), Byte.valueOf(b2));
        }
        return m2;
    }

    @InterfaceC8046mW0(name = "averageOfDouble")
    public static final double x7(@NotNull Double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Double d3 : dArr) {
            d2 += d3.doubleValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @InterfaceC9150r20(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @IR1(expression = "any { it == element }", imports = {}))
    @InterfaceC9636t20(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean x8(double[] dArr, double d2) {
        C6562gT0.p(dArr, "<this>");
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (dArr[i2] == d2) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Byte> x9(@NotNull byte[] bArr, int i2) {
        C6562gT0.p(bArr, "<this>");
        if (i2 >= 0) {
            return Fx(bArr, C5075aO1.u(bArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<C4180Rx1<Float, R>> xA(@NotNull float[] fArr, @NotNull R[] rArr) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(rArr, "other");
        int min = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            float f2 = fArr[i2];
            arrayList.add(C6670gv2.a(Float.valueOf(f2), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> xa(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
            }
        }
        return arrayList;
    }

    @XP0
    public static final Byte xb(byte[] bArr, HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (byte b2 : bArr) {
            if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
        }
        return null;
    }

    @Nullable
    public static final <T> T xc(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <R> R xd(@NotNull byte[] bArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super Byte, ? extends R> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, Byte.valueOf(bArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    @NotNull
    public static C11197zR0 xe(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        return new C11197zR0(0, Ge(sArr));
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Double>>> M xf(@NotNull double[] dArr, @NotNull M m2, @NotNull HA0<? super Double, ? extends K> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (double d2 : dArr) {
            K invoke = ha0.invoke(Double.valueOf(d2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(Double.valueOf(d2));
        }
        return m2;
    }

    @XP0
    public static final boolean xg(char[] cArr) {
        C6562gT0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String xh(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, HA0 ha0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = C6566gU0.h;
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            ha0 = null;
        }
        CharSequence charSequence5 = charSequence4;
        HA0 ha02 = ha0;
        return oh(zArr, charSequence, charSequence2, charSequence3, i2, charSequence5, ha02);
    }

    @NotNull
    public static final <T, R> List<R> xi(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(ha0.invoke(t));
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double xj(byte[] bArr, HA0<? super Byte, Double> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            double doubleValue = ha0.invoke(Byte.valueOf(bArr[0])).doubleValue();
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Byte.valueOf(bArr[i2])).doubleValue());
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float xk(short[] sArr, HA0<? super Short, Float> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Short.valueOf(sArr[0])).floatValue();
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Short.valueOf(sArr[i2])).floatValue());
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final float xl(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (fArr.length != 0) {
            float f2 = fArr[0];
            int Ce = Ce(fArr);
            int i2 = 1;
            if (1 <= Ce) {
                while (true) {
                    float f3 = fArr[i2];
                    if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) < 0) {
                        f2 = f3;
                    }
                    if (i2 == Ce) {
                        break;
                    }
                    i2++;
                }
            }
            return f2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R xm(char[] cArr, HA0<? super Character, ? extends R> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Character.valueOf(cArr[0]));
        int Ae = Ae(cArr);
        int i2 = 1;
        if (1 <= Ae) {
            while (true) {
                R invoke2 = ha0.invoke(Character.valueOf(cArr[i2]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == Ae) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Long xn(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int Ee = Ee(jArr);
        int i2 = 1;
        if (1 <= Ee) {
            while (true) {
                long j3 = jArr[i2];
                if (j2 > j3) {
                    j2 = j3;
                }
                if (i2 == Ee) {
                    break;
                }
                i2++;
            }
        }
        return Long.valueOf(j2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final float[] xo(float[] fArr, HA0<? super Float, C7458kA2> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (float f2 : fArr) {
            ha0.invoke(Float.valueOf(f2));
        }
        return fArr;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Integer xp(int[] iArr) {
        C6562gT0.p(iArr, "<this>");
        return yp(iArr, AbstractC10696xN1.X);
    }

    public static final boolean xq(@NotNull boolean[] zArr, @NotNull VA0<? super Boolean, ? super Boolean, Boolean> va0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(va0, "operation");
        int He = He(zArr);
        if (He >= 0) {
            boolean z = zArr[He];
            for (int i2 = He - 1; i2 >= 0; i2--) {
                z = va0.i(Boolean.valueOf(zArr[i2]), Boolean.valueOf(z)).booleanValue();
            }
            return z;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Long> xr(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return C8222nF.H();
        }
        List<Long> dz = dz(jArr);
        C9930uF.r1(dz);
        return dz;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> xs(float[] fArr, R r2, VA0<? super R, ? super Float, ? extends R> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (fArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r2);
        for (float f2 : fArr) {
            r2 = va0.i(r2, Float.valueOf(f2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean xt(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @NotNull
    public static final boolean[] xu(@NotNull boolean[] zArr, @NotNull Collection<Integer> collection) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(collection, "indices");
        boolean[] zArr2 = new boolean[collection.size()];
        int i2 = 0;
        for (Integer num : collection) {
            zArr2[i2] = zArr[num.intValue()];
            i2++;
        }
        return zArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> xv(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Xv(sArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double xw(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Double> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (byte b2 : bArr) {
            d2 += ha0.invoke(Byte.valueOf(b2)).doubleValue();
        }
        return d2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long xx(char[] cArr, HA0<? super Character, C9860tx2> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (char c2 : cArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(Character.valueOf(c2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C xy(@NotNull int[] iArr, @NotNull C c2) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (int i2 : iArr) {
            c2.add(Integer.valueOf(i2));
        }
        return c2;
    }

    @NotNull
    public static final Set<Short> xz(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) Ay(sArr, new LinkedHashSet(C8683p81.j(sArr.length)));
            }
            return A22.f(Short.valueOf(sArr[0]));
        }
        return B22.k();
    }

    public static final <T> boolean y5(@NotNull T[] tArr) {
        boolean z;
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M y6(@NotNull byte[] bArr, @NotNull M m2, @NotNull HA0<? super Byte, ? extends K> ha0, @NotNull HA0<? super Byte, ? extends V> ha02) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (byte b2 : bArr) {
            m2.put(ha0.invoke(Byte.valueOf(b2)), ha02.invoke(Byte.valueOf(b2)));
        }
        return m2;
    }

    @InterfaceC8046mW0(name = "averageOfFloat")
    public static final double y7(@NotNull Float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Float f2 : fArr) {
            d2 += f2.floatValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    @InterfaceC9150r20(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @IR1(expression = "any { it == element }", imports = {}))
    @InterfaceC9636t20(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean y8(float[] fArr, float f2) {
        C6562gT0.p(fArr, "<this>");
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (fArr[i2] == f2) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Character> y9(@NotNull char[] cArr, int i2) {
        C6562gT0.p(cArr, "<this>");
        if (i2 >= 0) {
            return Gx(cArr, C5075aO1.u(cArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, V> List<V> yA(@NotNull float[] fArr, @NotNull R[] rArr, @NotNull VA0<? super Float, ? super R, ? extends V> va0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(rArr, "other");
        C6562gT0.p(va0, "transform");
        int min = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(va0.i(Float.valueOf(fArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> ya(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (ha0.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @XP0
    public static final Character yb(char[] cArr, HA0<? super Character, Boolean> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (char c2 : cArr) {
            if (ha0.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
        }
        return null;
    }

    @Nullable
    public static final Short yc(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R yd(@NotNull char[] cArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super Character, ? extends R> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, Character.valueOf(cArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    @NotNull
    public static final C11197zR0 ye(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        return new C11197zR0(0, He(zArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M yf(@NotNull double[] dArr, @NotNull M m2, @NotNull HA0<? super Double, ? extends K> ha0, @NotNull HA0<? super Double, ? extends V> ha02) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        C6562gT0.p(ha02, "valueTransform");
        for (double d2 : dArr) {
            K invoke = ha0.invoke(Double.valueOf(d2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(ha02.invoke(Double.valueOf(d2)));
        }
        return m2;
    }

    @XP0
    public static final boolean yg(double[] dArr) {
        C6562gT0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return true;
        }
        return false;
    }

    public static byte yh(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[ze(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> yi(@NotNull short[] sArr, @NotNull HA0<? super Short, ? extends R> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s2 : sArr) {
            arrayList.add(ha0.invoke(Short.valueOf(s2)));
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double yj(char[] cArr, HA0<? super Character, Double> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (cArr.length != 0) {
            double doubleValue = ha0.invoke(Character.valueOf(cArr[0])).doubleValue();
            int Ae = Ae(cArr);
            int i2 = 1;
            if (1 <= Ae) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Character.valueOf(cArr[i2])).doubleValue());
                    if (i2 == Ae) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final Float yk(boolean[] zArr, HA0<? super Boolean, Float> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = ha0.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int He = He(zArr);
        int i2 = 1;
        if (1 <= He) {
            while (true) {
                floatValue = Math.max(floatValue, ha0.invoke(Boolean.valueOf(zArr[i2])).floatValue());
                if (i2 == He) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final int yl(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int De = De(iArr);
            int i3 = 1;
            if (1 <= De) {
                while (true) {
                    int i4 = iArr[i3];
                    if (comparator.compare(Integer.valueOf(i2), Integer.valueOf(i4)) < 0) {
                        i2 = i4;
                    }
                    if (i3 == De) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R ym(double[] dArr, HA0<? super Double, ? extends R> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Double.valueOf(dArr[0]));
        int Be = Be(dArr);
        int i2 = 1;
        if (1 <= Be) {
            while (true) {
                R invoke2 = ha0.invoke(Double.valueOf(dArr[i2]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == Be) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Short yn(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int Ge = Ge(sArr);
        int i2 = 1;
        if (1 <= Ge) {
            while (true) {
                short s3 = sArr[i2];
                if (s2 > s3) {
                    s2 = s3;
                }
                if (i2 == Ge) {
                    break;
                }
                i2++;
            }
        }
        return Short.valueOf(s2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final int[] yo(int[] iArr, HA0<? super Integer, C7458kA2> ha0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (int i2 : iArr) {
            ha0.invoke(Integer.valueOf(i2));
        }
        return iArr;
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final Integer yp(@NotNull int[] iArr, @NotNull AbstractC10696xN1 abstractC10696xN1) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(abstractC10696xN1, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[abstractC10696xN1.m(iArr.length)]);
    }

    public static final byte yq(@NotNull byte[] bArr, @NotNull XA0<? super Integer, ? super Byte, ? super Byte, Byte> xa0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int ze = ze(bArr);
        if (ze >= 0) {
            byte b2 = bArr[ze];
            for (int i2 = ze - 1; i2 >= 0; i2--) {
                b2 = xa0.P(Integer.valueOf(i2), Byte.valueOf(bArr[i2]), Byte.valueOf(b2)).byteValue();
            }
            return b2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final <T> List<T> yr(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return C8222nF.H();
        }
        List<T> ez = ez(tArr);
        C9930uF.r1(ez);
        return ez;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> ys(int[] iArr, R r2, VA0<? super R, ? super Integer, ? extends R> va0) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (iArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r2);
        for (int i2 : iArr) {
            r2 = va0.i(r2, Integer.valueOf(i2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean yt(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, Boolean> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        Boolean bool = null;
        boolean z = false;
        for (boolean z2 : zArr) {
            if (ha0.invoke(Boolean.valueOf(z2)).booleanValue()) {
                if (z) {
                    return null;
                }
                bool = Boolean.valueOf(z2);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return bool;
    }

    @NotNull
    public static final boolean[] yu(@NotNull boolean[] zArr, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(c11197zR0, "indices");
        if (c11197zR0.isEmpty()) {
            return new boolean[0];
        }
        return C4788Ye.n1(zArr, c11197zR0.d().intValue(), c11197zR0.h().intValue() + 1);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> yv(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Yv(zArr, new C11156zH.a(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double yw(@NotNull char[] cArr, @NotNull HA0<? super Character, Double> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (char c2 : cArr) {
            d2 += ha0.invoke(Character.valueOf(c2)).doubleValue();
        }
        return d2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long yx(double[] dArr, HA0<? super Double, C9860tx2> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (double d2 : dArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(Double.valueOf(d2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C yy(@NotNull long[] jArr, @NotNull C c2) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (long j2 : jArr) {
            c2.add(Long.valueOf(j2));
        }
        return c2;
    }

    @NotNull
    public static final Set<Boolean> yz(@NotNull boolean[] zArr) {
        C6562gT0.p(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) By(zArr, new LinkedHashSet(C8683p81.j(zArr.length)));
            }
            return A22.f(Boolean.valueOf(zArr[0]));
        }
        return B22.k();
    }

    public static final <T> boolean z5(@NotNull T[] tArr, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (T t : tArr) {
            if (ha0.invoke(t).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M z6(@NotNull char[] cArr, @NotNull M m2, @NotNull HA0<? super Character, ? extends K> ha0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (char c2 : cArr) {
            m2.put(ha0.invoke(Character.valueOf(c2)), Character.valueOf(c2));
        }
        return m2;
    }

    @InterfaceC8046mW0(name = "averageOfInt")
    public static final double z7(@NotNull Integer[] numArr) {
        C6562gT0.p(numArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (Integer num : numArr) {
            d2 += num.intValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / i2;
    }

    public static boolean z8(@NotNull int[] iArr, int i2) {
        C6562gT0.p(iArr, "<this>");
        if (Qf(iArr, i2) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final List<Double> z9(@NotNull double[] dArr, int i2) {
        C6562gT0.p(dArr, "<this>");
        if (i2 >= 0) {
            return Hx(dArr, C5075aO1.u(dArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<C4180Rx1<Integer, R>> zA(@NotNull int[] iArr, @NotNull Iterable<? extends R> iterable) {
        C6562gT0.p(iArr, "<this>");
        C6562gT0.p(iterable, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C8466oF.b0(iterable, 10), length));
        int i2 = 0;
        for (R r2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(C6670gv2.a(Integer.valueOf(iArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> za(@NotNull byte[] bArr, @NotNull VA0<? super Integer, ? super Byte, Boolean> va0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(va0, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            int i4 = i3 + 1;
            if (va0.i(Integer.valueOf(i3), Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @XP0
    public static final Double zb(double[] dArr, HA0<? super Double, Boolean> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (double d2 : dArr) {
            if (ha0.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
        }
        return null;
    }

    @Nullable
    public static final Short zc(@NotNull short[] sArr, @NotNull HA0<? super Short, Boolean> ha0) {
        C6562gT0.p(sArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        for (short s2 : sArr) {
            if (ha0.invoke(Short.valueOf(s2)).booleanValue()) {
                return Short.valueOf(s2);
            }
        }
        return null;
    }

    public static final <R> R zd(@NotNull double[] dArr, R r2, @NotNull XA0<? super Integer, ? super R, ? super Double, ? extends R> xa0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = xa0.P(Integer.valueOf(i3), r2, Double.valueOf(dArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static int ze(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return bArr.length - 1;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Float>>> M zf(@NotNull float[] fArr, @NotNull M m2, @NotNull HA0<? super Float, ? extends K> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(m2, "destination");
        C6562gT0.p(ha0, "keySelector");
        for (float f2 : fArr) {
            K invoke = ha0.invoke(Float.valueOf(f2));
            Object obj = m2.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m2.put(invoke, obj);
            }
            ((List) obj).add(Float.valueOf(f2));
        }
        return m2;
    }

    @XP0
    public static final boolean zg(float[] fArr) {
        C6562gT0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return true;
        }
        return false;
    }

    public static final byte zh(@NotNull byte[] bArr, @NotNull HA0<? super Byte, Boolean> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                byte b2 = bArr[length];
                if (ha0.invoke(Byte.valueOf(b2)).booleanValue()) {
                    return b2;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R> List<R> zi(@NotNull boolean[] zArr, @NotNull HA0<? super Boolean, ? extends R> ha0) {
        C6562gT0.p(zArr, "<this>");
        C6562gT0.p(ha0, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(ha0.invoke(Boolean.valueOf(z)));
        }
        return arrayList;
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final double zj(double[] dArr, HA0<? super Double, Double> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (dArr.length != 0) {
            double doubleValue = ha0.invoke(Double.valueOf(dArr[0])).doubleValue();
            int Be = Be(dArr);
            int i2 = 1;
            if (1 <= Be) {
                while (true) {
                    doubleValue = Math.max(doubleValue, ha0.invoke(Double.valueOf(dArr[i2])).doubleValue());
                    if (i2 == Be) {
                        break;
                    }
                    i2++;
                }
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R> R zk(byte[] bArr, Comparator<? super R> comparator, HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(ha0, "selector");
        if (bArr.length != 0) {
            Object obj = (R) ha0.invoke(Byte.valueOf(bArr[0]));
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    R invoke = ha0.invoke(Byte.valueOf(bArr[i2]));
                    if (comparator.compare(obj, invoke) < 0) {
                        obj = invoke;
                    }
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC8046mW0(name = "maxWithOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final long zl(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (jArr.length != 0) {
            long j2 = jArr[0];
            int Ee = Ee(jArr);
            int i2 = 1;
            if (1 <= Ee) {
                while (true) {
                    long j3 = jArr[i2];
                    if (comparator.compare(Long.valueOf(j2), Long.valueOf(j3)) < 0) {
                        j2 = j3;
                    }
                    if (i2 == Ee) {
                        break;
                    }
                    i2++;
                }
            }
            return j2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.4")
    public static final <R extends Comparable<? super R>> R zm(float[] fArr, HA0<? super Float, ? extends R> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = ha0.invoke(Float.valueOf(fArr[0]));
        int Ce = Ce(fArr);
        int i2 = 1;
        if (1 <= Ce) {
            while (true) {
                R invoke2 = ha0.invoke(Float.valueOf(fArr[i2]));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i2 == Ce) {
                    break;
                }
                i2++;
            }
        }
        return invoke;
    }

    @InterfaceC8046mW0(name = "minOrThrow")
    @InterfaceC6480g82(version = "1.7")
    public static final byte zn(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length != 0) {
            byte b2 = bArr[0];
            int ze = ze(bArr);
            int i2 = 1;
            if (1 <= ze) {
                while (true) {
                    byte b3 = bArr[i2];
                    if (b2 > b3) {
                        b2 = b3;
                    }
                    if (i2 == ze) {
                        break;
                    }
                    i2++;
                }
            }
            return b2;
        }
        throw new NoSuchElementException();
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final long[] zo(long[] jArr, HA0<? super Long, C7458kA2> ha0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(ha0, "action");
        for (long j2 : jArr) {
            ha0.invoke(Long.valueOf(j2));
        }
        return jArr;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final Long zp(long[] jArr) {
        C6562gT0.p(jArr, "<this>");
        return Ap(jArr, AbstractC10696xN1.X);
    }

    public static final char zq(@NotNull char[] cArr, @NotNull XA0<? super Integer, ? super Character, ? super Character, Character> xa0) {
        C6562gT0.p(cArr, "<this>");
        C6562gT0.p(xa0, "operation");
        int Ae = Ae(cArr);
        if (Ae >= 0) {
            char c2 = cArr[Ae];
            for (int i2 = Ae - 1; i2 >= 0; i2--) {
                c2 = xa0.P(Integer.valueOf(i2), Character.valueOf(cArr[i2]), Character.valueOf(c2)).charValue();
            }
            return c2;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Short> zr(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return C8222nF.H();
        }
        List<Short> fz = fz(sArr);
        C9930uF.r1(fz);
        return fz;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final <R> List<R> zs(long[] jArr, R r2, VA0<? super R, ? super Long, ? extends R> va0) {
        C6562gT0.p(jArr, "<this>");
        C6562gT0.p(va0, "operation");
        if (jArr.length == 0) {
            return C7979mF.k(r2);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r2);
        for (long j2 : jArr) {
            r2 = va0.i(r2, Long.valueOf(j2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @Nullable
    public static final Byte zt(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void zu(@NotNull T[] tArr, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(ha0, "selector");
        if (tArr.length > 1) {
            C4788Ye.h4(tArr, new C11156zH.a(ha0));
        }
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> zv(@NotNull byte[] bArr, @NotNull HA0<? super Byte, ? extends R> ha0) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "selector");
        return Qv(bArr, new C11156zH.c(ha0));
    }

    @InterfaceC9150r20(message = "Use sumOf instead.", replaceWith = @IR1(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC9636t20(warningSince = "1.5")
    public static final double zw(@NotNull double[] dArr, @NotNull HA0<? super Double, Double> ha0) {
        C6562gT0.p(dArr, "<this>");
        C6562gT0.p(ha0, "selector");
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += ha0.invoke(Double.valueOf(d3)).doubleValue();
        }
        return d2;
    }

    @XP0
    @InterfaceC8046mW0(name = "sumOfULong")
    @InterfaceC7161ix1
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5880dj0.class})
    public static final long zx(float[] fArr, HA0<? super Float, C9860tx2> ha0) {
        C6562gT0.p(fArr, "<this>");
        C6562gT0.p(ha0, "selector");
        long n2 = C9860tx2.n(0L);
        for (float f2 : fArr) {
            n2 = C9860tx2.n(n2 + ha0.invoke(Float.valueOf(f2)).p0());
        }
        return n2;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C zy(@NotNull T[] tArr, @NotNull C c2) {
        C6562gT0.p(tArr, "<this>");
        C6562gT0.p(c2, "destination");
        for (T t : tArr) {
            c2.add(t);
        }
        return c2;
    }

    @NotNull
    public static final short[] zz(@NotNull Short[] shArr) {
        C6562gT0.p(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            sArr[i2] = shArr[i2].shortValue();
        }
        return sArr;
    }
}
