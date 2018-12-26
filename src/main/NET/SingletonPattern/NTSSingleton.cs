namespace SingletonPattern
{
    /// <summary>
    /// Not Thread-Safe
    /// Bad code! Do not use!
    /// </summary>
    public sealed class NTSSingleton
    {
        private static NTSSingleton instance = null;

        private NTSSingleton()
        {
        }

        public static NTSSingleton Instance
        {
            get
            {
                if (instance == null)
                {
                    instance = new NTSSingleton();
                }
                return instance;
            }
        }
    }
}
