class week1 {
 int next(int n) {
    return n+1;
}

int previous(int n) {
     return n-1;
}

double doubleOf(double n) {
     return n*2;
}

int square (int n){
    
    return n*n;
}

int difference(int a, int b) {
    return (a-b);
    
}

double average (double a, double b){
    return ((a+b)/2);
}

double average(int a, int b) {
    return ((a+b)/2.0);
}

int round(double n) {
    return (int) (n+0.5);
}

boolean isNegative(int x) {
    return x < 0;
}

boolean isDigit(int x){
    return x>=0 & x<=9;
}

boolean isEven(int x){
    return x%2 == 0;
}

boolean isOdd(int x){
    return x%2 == 1 || x%2 == -1;
}

double abs(double x){
    return (x>=0) ? x : -x;
    
}


double min(double x, double y){
    return x<y ? x : y;
    
}

int sumNaturals(int n){
    return ((n+1)*n)/2;
}

boolean isVowel(char c) {
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
}

boolean inOrder(int a, int b, int c){
    return a<b && b<c;
}

boolean isIncluded(int n, int min, int max) {
    return n>= min && n <= max; 
}

boolean isExcluded(int n, int min, int max){
    
    return n<min || n>max;
}
    

boolean xor(boolean a, boolean b) {
    return a && !b || b && !a;
}

boolean sameSign (int a, int b){
    
    
    return (a>0 && b>0 || a<=0 && b<=0);
    
}

boolean onlyOnePositive(int a, int b){
    return a>0 && b<0 || b>0 && a<0;
} 
}

