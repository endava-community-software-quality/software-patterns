namespace SingletonPattern
{
    /// <summary>
    /// Attempted Thread-safety Using Double-Check Locking
    /// Bad code! Do not use!
    /// </summary>
    public sealed class DCLSingleton
    {
        private static DCLSingleton instance = null;
        private static readonly object padlock = new object();

        DCLSingleton()
        {
        }

        public static DCLSingleton Instance
        {
            get
            {
                if (instance == null)
                {
                    lock (padlock)
                    {
                        if (instance == null)
                        {
                            instance = new DCLSingleton();
                        }
                    }
                }
                return instance;
            }
        }
    }
}
